package com.project.electronicvotingsystem.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.electronicvotingsystem.Entity.VoterRequestEntity;
import com.project.electronicvotingsystem.Exception.VoterRequestNotFoundException;
import com.project.electronicvotingsystem.Service.VoterRequestService;

@RestController
@RequestMapping("/ElectrolOfficer")
public class ElectrolOfficerController {
	
	@Autowired
	private VoterRequestService voterRequestServices;
	
	@GetMapping("/view-voterRequest")
	public List<VoterRequestEntity> getAllLogin() {
		return voterRequestServices.getAllVoterRequest();
	}
	
	@GetMapping("view-voterRequest-by-id/{id}")
	public Optional<VoterRequestEntity> getLoginById(@PathVariable int id) throws VoterRequestNotFoundException {
		return voterRequestServices.getVoterRequest(id);
	}
	
	@PutMapping("approve-voterRequest/{id}")
	public VoterRequestEntity updateLogin(@PathVariable int id,@RequestParam String status) throws VoterRequestNotFoundException {
		
		Optional<VoterRequestEntity> voterReq = voterRequestServices.getVoterRequest(id);
		voterReq.get().setApplicationStatus(status);
		
		return voterRequestServices.updateVoterRequest(id, voterReq.get());
	}
}
