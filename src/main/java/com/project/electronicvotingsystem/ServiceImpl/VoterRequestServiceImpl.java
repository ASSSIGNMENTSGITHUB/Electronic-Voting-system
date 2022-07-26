package com.project.electronicvotingsystem.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.VoterRequestEntity;
import com.project.electronicvotingsystem.Exception.VoterRequestNotFoundException;
import com.project.electronicvotingsystem.Repository.VoterRequestRepository;
import com.project.electronicvotingsystem.Service.VoterRequestService;

@Service
public class VoterRequestServiceImpl implements VoterRequestService {

	@Autowired
	private VoterRequestRepository voterReqRepo;
	
	@Override
	public List<VoterRequestEntity> getAllVoterRequest() {
		return voterReqRepo.findAll();
	}

	@Override
	public Optional<VoterRequestEntity> getVoterRequest(int id) throws VoterRequestNotFoundException {
		try {
			Optional<VoterRequestEntity> voterReqData = voterReqRepo.findById(id);
			if(!voterReqData.isEmpty()) {
				return voterReqRepo.findById(id);
			}
			else {
				throw new VoterRequestNotFoundException("VoterRequest Data not found");
			}
		}
		catch(Exception e){
			throw new VoterRequestNotFoundException("VoterRequest Data not found");
		}	
	}

	@Override
	public VoterRequestEntity addVoterRequest(VoterRequestEntity voterReqEntity) {
		// TODO Auto-generated method stub
		return voterReqRepo.save(voterReqEntity);
	}

	@Override
	public Optional<VoterRequestEntity> deleteVoterRequest(int id) throws VoterRequestNotFoundException {

		try {
			Optional<VoterRequestEntity> voterReqData = voterReqRepo.findById(id);
			if(!voterReqData.isEmpty()) {
				voterReqRepo.deleteById(id);
				return voterReqData;
			}
			else {
				throw new VoterRequestNotFoundException("VoterRequest Data not found");
			}
		}
		catch(Exception e){
			throw new VoterRequestNotFoundException("VoterRequest Data not found");
		}
	}

	@Override
	public VoterRequestEntity updateVoterRequest(int id, VoterRequestEntity voterReqEntity) throws VoterRequestNotFoundException {
		try {
			Optional<VoterRequestEntity> voterReqData = voterReqRepo.findById(id);
			if(!voterReqData.isEmpty()) {
				voterReqEntity.setId(id);
				return voterReqRepo.save(voterReqEntity);
			}
			else {
				throw new VoterRequestNotFoundException("VoterRequest Data not found");
			}
		}
		catch(Exception e){
			throw new VoterRequestNotFoundException("VoterRequest Data not found");
		}	
	}
	

}


