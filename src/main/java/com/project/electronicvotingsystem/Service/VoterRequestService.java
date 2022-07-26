package com.project.electronicvotingsystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.VoterRequestEntity;
import com.project.electronicvotingsystem.Exception.VoterRequestNotFoundException;

@Service
public interface VoterRequestService {

	public List<VoterRequestEntity> getAllVoterRequest();
	
	public Optional<VoterRequestEntity> getVoterRequest(int id) throws VoterRequestNotFoundException;
	
	public VoterRequestEntity addVoterRequest(VoterRequestEntity voterRequestEntity);
	
	public Optional<VoterRequestEntity> deleteVoterRequest(int id) throws VoterRequestNotFoundException;
	
	public VoterRequestEntity updateVoterRequest(int id, VoterRequestEntity voterRequestEntity) throws VoterRequestNotFoundException;
}