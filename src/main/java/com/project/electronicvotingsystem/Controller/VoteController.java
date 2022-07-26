
	package com.project.electronicvotingsystem.Controller;

	import java.util.List;
	import java.util.Optional;

	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.project.electronicvotingsystem.DTO.VoteDTO;
	import com.project.electronicvotingsystem.Entity.VoteEntity;
	import com.project.electronicvotingsystem.Exception.UserNotFoundException;
	import com.project.electronicvotingsystem.Service.VoteService;

	@RestController
	public class VoteController {
		
		@Autowired
		private VoteService voteService;
		
		@GetMapping("result")
		public List<Object> getAllVote() throws UserNotFoundException {
			return voteService.getAllVote();
		}
		
		@PostMapping("cast-vote")
		public VoteEntity addLogin(@Valid @RequestBody VoteEntity voteEntity) {
			return voteService.addVote(voteEntity);
		}
		
	}


