
	package com.project.electronicvotingsystem.Service;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.stereotype.Service;

	import com.project.electronicvotingsystem.DTO.VoteDTO;
	import com.project.electronicvotingsystem.Entity.VoteEntity;

	@Service
	public interface VoteService {
		

		public List<Object> getAllVote();
		
		public VoteEntity addVote(VoteEntity voteEntity);
		

	}



