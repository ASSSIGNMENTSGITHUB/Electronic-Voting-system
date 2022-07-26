package com.project.electronicvotingsystem.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.ElectionEntity;
import com.project.electronicvotingsystem.Exception.ElectionNotFoundException;
import com.project.electronicvotingsystem.Repository.ElectionRepository;
import com.project.electronicvotingsystem.Service.ElectionService;

@Service
public class ElectionServiceImpl implements ElectionService {

	@Autowired
	private ElectionRepository electionRepo;
	
	@Override
	public List<ElectionEntity> getAllElection() {
		return electionRepo.findAll();
	}

	@Override
	public Optional<ElectionEntity> getElection(int id) throws ElectionNotFoundException {
		try {
			Optional<ElectionEntity> electionData = electionRepo.findById(id);
			if(!electionData.isEmpty()) {
				return electionRepo.findById(id);
			}
			else {
				throw new ElectionNotFoundException("Election Data not found");
			}
		}
		catch(Exception e){
			throw new ElectionNotFoundException("Election Data not found");
		}	
	}

	@Override
	public ElectionEntity addElection(ElectionEntity electionEntity) {
		// TODO Auto-generated method stub
		return electionRepo.save(electionEntity);
	}

	@Override
	public Optional<ElectionEntity> deleteElection(int id) throws ElectionNotFoundException {

		try {
			Optional<ElectionEntity> electionData = electionRepo.findById(id);
			if(!electionData.isEmpty()) {
				electionRepo.deleteById(id);
				return electionData;
			}
			else {
				throw new ElectionNotFoundException("Election Data not found");
			}
		}
		catch(Exception e){
			throw new ElectionNotFoundException("Election Data not found");
		}
	}

	@Override
	public ElectionEntity updateElection(int id, ElectionEntity electionEntity) throws ElectionNotFoundException {
		try {
			Optional<ElectionEntity> electionData = electionRepo.findById(id);
			if(!electionData.isEmpty()) {
				electionEntity.setElectionId(id);
				return electionRepo.save(electionEntity);
			}
			else {
				throw new ElectionNotFoundException("Election Data not found");
			}
		}
		catch(Exception e){
			throw new ElectionNotFoundException("Election Data not found");
		}	
	}
	

}

