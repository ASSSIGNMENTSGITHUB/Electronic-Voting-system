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

import com.project.electronicvotingsystem.Entity.ElectionEntity;
import com.project.electronicvotingsystem.Exception.ElectionNotFoundException;
import com.project.electronicvotingsystem.Service.ElectionService;


@RestController
public class ElectionController {
	
	@Autowired
	private ElectionService electionServices;
	
	@GetMapping("/election")
	public List<ElectionEntity> getAllElection() {
		return electionServices.getAllElection();
	}
	
	@GetMapping("election/{id}")
	public Optional<ElectionEntity> getElectionById(@PathVariable int id) throws ElectionNotFoundException {
		return electionServices.getElection(id);
	}
	
	@PostMapping("election")
	public ElectionEntity addElection(@Valid @RequestBody ElectionEntity electionEntity) {
		return electionServices.addElection(electionEntity);
	}
	
	@PutMapping("election/{id}")
	public ElectionEntity updateElection(@PathVariable int id,@Valid @RequestBody ElectionEntity electionEntity) throws ElectionNotFoundException {
		return electionServices.updateElection(id, electionEntity);
	}
	
	@DeleteMapping("election/{id}")
	public Optional<ElectionEntity> deleteElection(@PathVariable int id) throws ElectionNotFoundException {
		return electionServices.deleteElection(id);
	}

}

