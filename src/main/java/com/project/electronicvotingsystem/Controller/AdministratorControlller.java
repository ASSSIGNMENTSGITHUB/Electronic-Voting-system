package com.project.electronicvotingsystem.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.electronicvotingsystem.Entity.CandidateEntity;
import com.project.electronicvotingsystem.Entity.ElectionEntity;
import com.project.electronicvotingsystem.Entity.PartyEntity;
import com.project.electronicvotingsystem.Entity.VoterRequestEntity;
import com.project.electronicvotingsystem.Exception.CandidateNotFoundException;
import com.project.electronicvotingsystem.Exception.ElectionNotFoundException;
import com.project.electronicvotingsystem.Exception.PartyNotFoundException;
import com.project.electronicvotingsystem.Exception.VoterRequestNotFoundException;
import com.project.electronicvotingsystem.Service.CandidateService;
import com.project.electronicvotingsystem.Service.ElectionService;
import com.project.electronicvotingsystem.Service.PartyService;
import com.project.electronicvotingsystem.Service.VoterRequestService;


@RestController
public class AdministratorControlller {
	
	@Autowired
	private ElectionService electionServices;
	
	
	@PostMapping("add-election")
	public ElectionEntity addElection(@Valid @RequestBody ElectionEntity electionEntity) {
		return electionServices.addElection(electionEntity);
	}
	
	@GetMapping("/view-election")
	public List<ElectionEntity> getAllElection() {
		return electionServices.getAllElection();
	}
	
	@GetMapping("view-election-by-id/{id}")
	public Optional<ElectionEntity> getElectionById(@PathVariable int id) throws ElectionNotFoundException {
		return electionServices.getElection(id);
	}
	
	@Autowired
	private PartyService partyServices;
	
	@GetMapping("/view-party")
	public List<PartyEntity> getAllParty() {
		return partyServices.getAllParty();
	}
	
	@GetMapping("/view-party-by-id/{id}")
	public Optional<PartyEntity> getPartyById(@PathVariable int id) throws PartyNotFoundException {
		return partyServices.getParty(id);
	}
	
	@PostMapping("/add-party")
	public PartyEntity addParty(@Valid @RequestBody PartyEntity partyEntity) {
		return partyServices.addParty(partyEntity);
	}
	
	@Autowired
	private CandidateService candidateServices;
	
	@GetMapping("/view-candidate")
	public List<CandidateEntity> getAllCandidate() {
		return candidateServices.getAllCandidate();
	}
	
	@GetMapping("view-candidate-by-id/{id}")
	public Optional<CandidateEntity> getCandidateById(@PathVariable int id) throws CandidateNotFoundException {
		return candidateServices.getCandidate(id);
	}
	
	@PostMapping("add-candidate")
	public CandidateEntity addCandidate(@Valid @RequestBody CandidateEntity candidateEntity) {
		return candidateServices.addCandidate(candidateEntity);
	}
	
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
