package com.project.electronicvotingsystem.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.electronicvotingsystem.Entity.CandidateEntity;
import com.project.electronicvotingsystem.Entity.ElectionEntity;
import com.project.electronicvotingsystem.Entity.ScheduleEntity;
import com.project.electronicvotingsystem.Entity.UserEntity;
import com.project.electronicvotingsystem.Entity.VoterRequestEntity;
import com.project.electronicvotingsystem.Exception.CandidateNotFoundException;
import com.project.electronicvotingsystem.Exception.ElectionNotFoundException;
import com.project.electronicvotingsystem.Exception.ScheduleNotFoundException;
import com.project.electronicvotingsystem.Exception.UserNotFoundException;
import com.project.electronicvotingsystem.Exception.VoterRequestNotFoundException;
import com.project.electronicvotingsystem.Service.CandidateService;
import com.project.electronicvotingsystem.Service.ElectionService;
import com.project.electronicvotingsystem.Service.ScheduleService;
import com.project.electronicvotingsystem.Service.UserService;
import com.project.electronicvotingsystem.Service.VoteService;
import com.project.electronicvotingsystem.Service.VoterRequestService;

@RestController
@RequestMapping("/Voter")
public class VoterController {
	
	@Autowired
	private UserService userServices;
	
	@GetMapping("/view-user")
	public List<UserEntity> getAllLogin() {
		return userServices.getAllUser();
	}
	
	@PostMapping("/register-user")
	public UserEntity addLogin(@Valid @RequestBody UserEntity userEntity) {
		return userServices.addUser(userEntity);
	}
	
	@Autowired
	private VoterRequestService voterRequestServices;
	
	@GetMapping("/view-voterRequest")
	public List<VoterRequestEntity> getAllVoterRequest() {
		return voterRequestServices.getAllVoterRequest();
	}
	
	@GetMapping("view-voterRequest-by-id/{id}")
	public Optional<VoterRequestEntity> getVoterRequestById(@PathVariable int id) throws VoterRequestNotFoundException {
		return voterRequestServices.getVoterRequest(id);
	}
	
	@PostMapping("/add-voterRequest")
	public VoterRequestEntity addVoterRequest(@Valid @RequestBody VoterRequestEntity voterRequestEntity) {
		return voterRequestServices.addVoterRequest(voterRequestEntity);
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
	
	@Autowired
	private ElectionService electionServices;
	@Autowired
	private VoteService voteService;
	@GetMapping("result")
	public List<Object> getAllVote() throws UserNotFoundException {
		return voteService.getAllVote();
	}
	
	@PostMapping("cast-vote")
	public ElectionEntity addElection(@Valid @RequestBody ElectionEntity electionEntity) {
		return electionServices.addElection(electionEntity);
	}
	
	@Autowired
	private ScheduleService scheduleServices;
	
	@GetMapping("/view-schedule")
	public List<ScheduleEntity> getAllSchedule() {
		return scheduleServices.getAllSchedule();
	}
	
	@GetMapping("view-schedule-by-id/{id}")
	public Optional<ScheduleEntity> getScheduleById(@PathVariable int id) throws ScheduleNotFoundException {
		return scheduleServices.getSchedule(id);
	}

}
