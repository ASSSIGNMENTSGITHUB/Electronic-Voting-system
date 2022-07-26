package com.project.electronicvotingsystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.ElectionEntity;
import com.project.electronicvotingsystem.Exception.ElectionNotFoundException;

@Service
public interface ElectionService {

	public List<ElectionEntity> getAllElection();
	
	public Optional<ElectionEntity> getElection(int id) throws ElectionNotFoundException;
	
	public ElectionEntity addElection(ElectionEntity electionEntity);
	
	public Optional<ElectionEntity> deleteElection(int id) throws ElectionNotFoundException;
	
	public ElectionEntity updateElection(int id, ElectionEntity electionEntity) throws ElectionNotFoundException;
}
