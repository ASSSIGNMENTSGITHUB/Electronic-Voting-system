package com.project.electronicvotingsystem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.electronicvotingsystem.Entity.ElectionEntity;
import com.project.electronicvotingsystem.Exception.ElectionNotFoundException;
import com.project.electronicvotingsystem.Service.ElectionService;

@ExtendWith(MockitoExtension.class)
public class ElectionTest {

	@Mock
	ElectionService electionService;

	@Test
	void addElectionTest(){
		ElectionEntity electionEntity = new ElectionEntity(1,"mahii","VB nagar Constituency","Telangana");
		when(electionService.addElection(electionEntity)).thenReturn(electionEntity);
		assertEquals(electionService.addElection(electionEntity),electionEntity);
	}
	
	@Test
	void getElectionTest() throws ElectionNotFoundException {
		ElectionEntity electionEntity = new ElectionEntity(1,"mahii","VB nagar Constituency","Telangana");
		Optional<ElectionEntity> OElectionEntity = Optional.of(electionEntity);
		when(electionService.getElection(1)).thenReturn(OElectionEntity);
		assertEquals(electionService.getElection(1).get(),electionEntity);
	}
	
	@Test
	void updateElectionTest() throws ElectionNotFoundException {
		ElectionEntity electionEntity = new ElectionEntity(1,"mahii","VB nagar Constituency","Telangana");
		when(electionService.updateElection(1,electionEntity)).thenReturn(electionEntity);
		assertEquals(electionService.updateElection(1,electionEntity),electionEntity);
	}
	
	@Test
	void deleteElectionTest() throws ElectionNotFoundException {
		ElectionEntity electionEntity = new ElectionEntity(1,"mahii","VB nagar Constituency","Telangana");
		Optional<ElectionEntity> OElectionEntity = Optional.of(electionEntity);
		when(electionService.deleteElection(1)).thenReturn(OElectionEntity);
		assertEquals(electionService.deleteElection(1).get(),electionEntity);
	}

}
