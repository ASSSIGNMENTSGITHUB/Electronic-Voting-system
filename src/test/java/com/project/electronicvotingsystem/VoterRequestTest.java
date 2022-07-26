package com.project.electronicvotingsystem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.electronicvotingsystem.Entity.VoterRequestEntity;
import com.project.electronicvotingsystem.Exception.VoterRequestNotFoundException;
import com.project.electronicvotingsystem.Service.VoterRequestService;

@ExtendWith(MockitoExtension.class)
public class VoterRequestTest {

	@Mock
	VoterRequestService voterRequestService;

	@Test
	void addVoterRequestTest(){
		VoterRequestEntity voterRequestEntity = new VoterRequestEntity(1,"mahii","12345","Hyd","VB nagar constituency","ENAP12L","Approved");
		when(voterRequestService.addVoterRequest(voterRequestEntity)).thenReturn(voterRequestEntity);
		assertEquals(voterRequestService.addVoterRequest(voterRequestEntity),voterRequestEntity);
	} 
	
	@Test
	void getVoterRequestTest() throws VoterRequestNotFoundException {
		VoterRequestEntity voterRequestEntity = new VoterRequestEntity(1,"mahii","12345","Hyd","VB nagar constituency","ENAP12L","Approved");
		Optional<VoterRequestEntity> OVoterRequestEntity = Optional.of(voterRequestEntity);
		when(voterRequestService.getVoterRequest(1)).thenReturn(OVoterRequestEntity);
		assertEquals(voterRequestService.getVoterRequest(1).get(),voterRequestEntity);
	}
	
	@Test
	void updateVoterRequestTest() throws VoterRequestNotFoundException {
		VoterRequestEntity voterRequestEntity = new VoterRequestEntity(1,"mahii","12345","Hyd","VB nagar constituency","ENAP12L","Approved");
		when(voterRequestService.updateVoterRequest(1,voterRequestEntity)).thenReturn(voterRequestEntity);
		assertEquals(voterRequestService.updateVoterRequest(1,voterRequestEntity),voterRequestEntity);
	}
	
	@Test
	void deleteVoterRequestTest() throws VoterRequestNotFoundException {
		VoterRequestEntity voterRequestEntity = new VoterRequestEntity(1,"mahii","12345","Hyd","VB nagar constituency","ENAP12L","Approved");
		Optional<VoterRequestEntity> OVoterRequestEntity = Optional.of(voterRequestEntity);
		when(voterRequestService.deleteVoterRequest(1)).thenReturn(OVoterRequestEntity);
		assertEquals(voterRequestService.deleteVoterRequest(1).get(),voterRequestEntity);
	}

}
