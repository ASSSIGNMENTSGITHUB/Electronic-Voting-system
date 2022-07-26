package com.project.electronicvotingsystem.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.electronicvotingsystem.Entity.VoterRequestEntity;
import com.project.electronicvotingsystem.Exception.VoterRequestNotFoundException;
import com.project.electronicvotingsystem.Service.VoterRequestService;

@RestController
public class VoterRequestController {
	
	@Autowired
	private VoterRequestService voterRequestServices;
	
	@GetMapping("/voterRequest")
	public List<VoterRequestEntity> getAllVoterRequest() {
		return voterRequestServices.getAllVoterRequest();
	}
	
	@GetMapping("voterRequest/{id}")
	public Optional<VoterRequestEntity> getVoterRequestById(@PathVariable int id) throws VoterRequestNotFoundException {
		return voterRequestServices.getVoterRequest(id);
	}
	
	@PostMapping("voterRequest")
	public VoterRequestEntity addVoterRequest(@Valid @RequestBody VoterRequestEntity voterRequestEntity) {
		return voterRequestServices.addVoterRequest(voterRequestEntity);
	}
	
	@PutMapping("voterRequest/{id}")
	public VoterRequestEntity updateVoterRequest(@PathVariable int id,@Valid @RequestBody VoterRequestEntity voterRequestEntity) throws VoterRequestNotFoundException {
		return voterRequestServices.updateVoterRequest(id, voterRequestEntity);
	}
	
	@DeleteMapping("voterRequest/{id}")
	public Optional<VoterRequestEntity> deleteVoterRequest(@PathVariable int id) throws VoterRequestNotFoundException {
		return voterRequestServices.deleteVoterRequest(id);
	}

}

