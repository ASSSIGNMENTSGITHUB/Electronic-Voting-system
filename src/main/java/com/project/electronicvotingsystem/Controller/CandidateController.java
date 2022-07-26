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

import com.project.electronicvotingsystem.Entity.CandidateEntity;
import com.project.electronicvotingsystem.Exception.CandidateNotFoundException;
import com.project.electronicvotingsystem.Service.CandidateService;

@RestController
public class CandidateController {
	
	@Autowired
	private CandidateService candidateServices;
	
	@GetMapping("/candidate")
	public List<CandidateEntity> getAllCandidate() {
		return candidateServices.getAllCandidate();
	}
	
	@GetMapping("candidate/{id}")
	public Optional<CandidateEntity> getCandidateById(@PathVariable int id) throws CandidateNotFoundException {
		return candidateServices.getCandidate(id);
	}
	
	@PostMapping("candidate")
	public CandidateEntity addCandidate(@Valid @RequestBody CandidateEntity candidateEntity) {
		return candidateServices.addCandidate(candidateEntity);
	}
	
	@PutMapping("candidate/{id}")
	public CandidateEntity updateCandidate(@PathVariable int id,@Valid @RequestBody CandidateEntity candidateEntity) throws CandidateNotFoundException {
		return candidateServices.updateCandidate(id, candidateEntity);
	}
	
	@DeleteMapping("candidate/{id}")
	public Optional<CandidateEntity> deleteCandidate(@PathVariable int id) throws CandidateNotFoundException {
		return candidateServices.deleteCandidate(id);
	}

}

