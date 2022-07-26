package com.project.electronicvotingsystem.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.PartyEntity;
import com.project.electronicvotingsystem.Exception.PartyNotFoundException;
import com.project.electronicvotingsystem.Repository.PartyRepository;
import com.project.electronicvotingsystem.Service.PartyService;

@Service
public class PartyServiceImpl implements PartyService {

	@Autowired
	private PartyRepository partyRepo;
	
	@Override
	public List<PartyEntity> getAllParty() {
		return partyRepo.findAll();
	}

	@Override
	public Optional<PartyEntity> getParty(int id) throws PartyNotFoundException {
		try {
			Optional<PartyEntity> partyData = partyRepo.findById(id);
			if(!partyData.isEmpty()) {
				return partyRepo.findById(id);
			}
			else {
				throw new PartyNotFoundException("Party Data not found");
			}
		}
		catch(Exception e){
			throw new PartyNotFoundException("Party Data not found");
		}	
	}

	@Override
	public PartyEntity addParty(PartyEntity partyEntity) {
		// TODO Auto-generated method stub
		return partyRepo.save(partyEntity);
	}

	@Override
	public Optional<PartyEntity> deleteParty(int id) throws PartyNotFoundException {

		try {
			Optional<PartyEntity> partyData = partyRepo.findById(id);
			if(!partyData.isEmpty()) {
				partyRepo.deleteById(id);
				return partyData;
			}
			else {
				throw new PartyNotFoundException("Party Data not found");
			}
		}
		catch(Exception e){
			throw new PartyNotFoundException("Party Data not found");
		}
	}

	@Override
	public PartyEntity updateParty(int id, PartyEntity partyEntity) throws PartyNotFoundException {
		try {
			Optional<PartyEntity> partyData = partyRepo.findById(id);
			if(!partyData.isEmpty()) {
				partyEntity.setPartyId(id);
				return partyRepo.save(partyEntity);
			}
			else {
				throw new PartyNotFoundException("Party Data not found");
			}
		}
		catch(Exception e){
			throw new PartyNotFoundException("Party Data not found");
		}	
	}
	

}

