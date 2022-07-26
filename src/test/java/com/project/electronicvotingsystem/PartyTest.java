package com.project.electronicvotingsystem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.electronicvotingsystem.Entity.PartyEntity;
import com.project.electronicvotingsystem.Exception.PartyNotFoundException;
import com.project.electronicvotingsystem.Service.PartyService;

@ExtendWith(MockitoExtension.class)
public class PartyTest {

	@Mock
	PartyService partyService;

	@Test
	void addPartyTest(){
		PartyEntity partyEntity = new PartyEntity(1,"BJP","Modi","Lotus");
		when(partyService.addParty(partyEntity)).thenReturn(partyEntity);
		assertEquals(partyService.addParty(partyEntity),partyEntity);
	}
	
	@Test
	void getPartyTest() throws PartyNotFoundException {
		PartyEntity partyEntity = new PartyEntity(1,"BJP","Modi","Lotus");
		Optional<PartyEntity> OPartyEntity = Optional.of(partyEntity);
		when(partyService.getParty(1)).thenReturn(OPartyEntity);
		assertEquals(partyService.getParty(1).get(),partyEntity);
	}
	
	@Test
	void updatePartyTest() throws PartyNotFoundException {
		PartyEntity partyEntity = new PartyEntity(1,"BJP","Modi","Lotus");
		when(partyService.updateParty(1,partyEntity)).thenReturn(partyEntity);
		assertEquals(partyService.updateParty(1,partyEntity),partyEntity);
	}
	
	@Test
	void deletePartyTest() throws PartyNotFoundException {
		PartyEntity partyEntity = new PartyEntity(1,"BJP","Modi","Lotus");
		Optional<PartyEntity> OPartyEntity = Optional.of(partyEntity);
		when(partyService.deleteParty(1)).thenReturn(OPartyEntity);
		assertEquals(partyService.deleteParty(1).get(),partyEntity);
	}

}
