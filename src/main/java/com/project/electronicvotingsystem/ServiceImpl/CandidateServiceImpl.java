package com.project.electronicvotingsystem.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.CandidateEntity;
import com.project.electronicvotingsystem.Exception.CandidateNotFoundException;
import com.project.electronicvotingsystem.Repository.CandidateRepository;
import com.project.electronicvotingsystem.Service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateRepository candidateRepo;
	
	@Override
	public List<CandidateEntity> getAllCandidate() {
		return candidateRepo.findAll();
	}

	@Override
	public Optional<CandidateEntity> getCandidate(int id) throws CandidateNotFoundException {
		try {
			Optional<CandidateEntity> candidateData = candidateRepo.findById(id);
			if(!candidateData.isEmpty()) {
				return candidateRepo.findById(id);
			}
			else {
				throw new CandidateNotFoundException("Candidate Data not found");
			}
		}
		catch(Exception e){
			throw new CandidateNotFoundException("Candidate Data not found");
		}	
	}

	@Override
	public CandidateEntity addCandidate(CandidateEntity candidateEntity) {
		// TODO Auto-generated method stub
		return candidateRepo.save(candidateEntity);
	}

	@Override
	public Optional<CandidateEntity> deleteCandidate(int id) throws CandidateNotFoundException {

		try {
			Optional<CandidateEntity> candidateData = candidateRepo.findById(id);
			if(!candidateData.isEmpty()) {
				candidateRepo.deleteById(id);
				return candidateData;
			}
			else {
				throw new CandidateNotFoundException("Candidate Data not found");
			}
		}
		catch(Exception e){
			throw new CandidateNotFoundException("Candidate Data not found");
		}
	}

	@Override
	public CandidateEntity updateCandidate(int id, CandidateEntity candidateEntity) throws CandidateNotFoundException {
		try {
			Optional<CandidateEntity> candidateData = candidateRepo.findById(id);
			if(!candidateData.isEmpty()) {
				candidateEntity.setId(id);
				return candidateRepo.save(candidateEntity);
			}
			else {
				throw new CandidateNotFoundException("Candidate Data not found");
			}
		}
		catch(Exception e){
			throw new CandidateNotFoundException("Candidate Data not found");
		}	
	}
	

}

