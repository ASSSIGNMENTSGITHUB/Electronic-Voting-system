package com.project.electronicvotingsystem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.electronicvotingsystem.Entity.CandidateEntity;
import com.project.electronicvotingsystem.Exception.CandidateNotFoundException;
import com.project.electronicvotingsystem.Service.CandidateService;

@ExtendWith(MockitoExtension.class)
public class CandidateTest {

	@Mock
	CandidateService candidateService;

	@Test
	void addCandidateTest(){
		CandidateEntity candidateEntity = new CandidateEntity(1,"mahii","Hyderabad","BJP","30","8790012308");
		when(candidateService.addCandidate(candidateEntity)).thenReturn(candidateEntity);
		assertEquals(candidateService.addCandidate(candidateEntity),candidateEntity);
	}
	
	@Test
	void getCandidateTest() throws CandidateNotFoundException {
		CandidateEntity candidateEntity = new CandidateEntity(1,"mahii","Hyderabad","BJP","30","8790012308");
		Optional<CandidateEntity> OCandidateEntity = Optional.of(candidateEntity);
		when(candidateService.getCandidate(1)).thenReturn(OCandidateEntity);
		assertEquals(candidateService.getCandidate(1).get(),candidateEntity);
	}
	
	@Test
	void updateCandidateTest() throws CandidateNotFoundException {
		CandidateEntity candidateEntity = new CandidateEntity(1,"mahii","Hyderabad","BJP","30","8790012308");
		when(candidateService.updateCandidate(1,candidateEntity)).thenReturn(candidateEntity);
		assertEquals(candidateService.updateCandidate(1,candidateEntity),candidateEntity);
	}
	
	@Test
	void deleteCandidateTest() throws CandidateNotFoundException {
		CandidateEntity candidateEntity = new CandidateEntity(1,"mahii","Hyderabad","BJP","30","8790012308");
		Optional<CandidateEntity> OCandidateEntity = Optional.of(candidateEntity);
		when(candidateService.deleteCandidate(1)).thenReturn(OCandidateEntity);
		assertEquals(candidateService.deleteCandidate(1).get(),candidateEntity);
	}

}
