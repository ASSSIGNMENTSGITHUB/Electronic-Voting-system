
	package com.project.electronicvotingsystem.ServiceImpl;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.project.electronicvotingsystem.DTO.VoteDTO;
	import com.project.electronicvotingsystem.Entity.VoteEntity;
	import com.project.electronicvotingsystem.Repository.VoteRepository;
	import com.project.electronicvotingsystem.Service.VoteService;

	@Service
	public class VoteServiceImpl implements VoteService{
		
		@Autowired
		private VoteRepository voteRepository;
		
		@Override
		public List<Object> getAllVote() {
			
			 return voteRepository.getResults();
		}

		@Override
		public VoteEntity addVote(VoteEntity voteEntity) {
			
			return voteRepository.save(voteEntity);
		}

	}


