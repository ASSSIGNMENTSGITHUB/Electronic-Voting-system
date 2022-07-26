package com.project.electronicvotingsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.electronicvotingsystem.Entity.VoterRequestEntity;

@Repository
public interface VoterRequestRepository extends JpaRepository<VoterRequestEntity,Integer> {

}
