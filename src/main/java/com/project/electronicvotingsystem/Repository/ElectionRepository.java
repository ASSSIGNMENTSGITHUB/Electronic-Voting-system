package com.project.electronicvotingsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.electronicvotingsystem.Entity.ElectionEntity;

@Repository
public interface ElectionRepository extends JpaRepository<ElectionEntity,Integer> {

}
