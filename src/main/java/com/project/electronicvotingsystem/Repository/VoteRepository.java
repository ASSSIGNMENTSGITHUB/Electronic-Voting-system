
	package com.project.electronicvotingsystem.Repository;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.stereotype.Repository;

	import com.project.electronicvotingsystem.DTO.VoteDTO;
	import com.project.electronicvotingsystem.Entity.VoteEntity;

	@Repository
	public interface VoteRepository extends JpaRepository<VoteEntity,Integer> {
		
		@Query(value = "SELECT  v.party_name AS partyName,count(*) AS count FROM vote v GROUP BY v.party_name",nativeQuery = true)
		List<Object> getResults();



	}

