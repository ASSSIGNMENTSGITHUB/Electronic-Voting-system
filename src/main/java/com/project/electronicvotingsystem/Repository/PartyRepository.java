package com.project.electronicvotingsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.electronicvotingsystem.Entity.PartyEntity;

@Repository
public interface PartyRepository extends JpaRepository<PartyEntity,Integer> {

}
