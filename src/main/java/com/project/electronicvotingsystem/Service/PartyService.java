package com.project.electronicvotingsystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.PartyEntity;
import com.project.electronicvotingsystem.Exception.PartyNotFoundException;

@Service
public interface PartyService {

	public List<PartyEntity> getAllParty();
	
	public Optional<PartyEntity> getParty(int id) throws PartyNotFoundException;
	
	public PartyEntity addParty(PartyEntity partyEntity);
	
	public Optional<PartyEntity> deleteParty(int id) throws PartyNotFoundException;
	
	public PartyEntity updateParty(int id, PartyEntity partyEntity) throws PartyNotFoundException;
}
