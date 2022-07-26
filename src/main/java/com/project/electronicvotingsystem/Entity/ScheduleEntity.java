package com.project.electronicvotingsystem.Entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class ScheduleEntity {
	
	@Id
	private int id;
	
	@NotNull(message="electionName is mandatory")
	private String electionName;
	
	@NotNull(message="electionDate is mandatory")
	private LocalDate electionDate;

	public ScheduleEntity() {
		super();
	}

	@Override
	public String toString() {
		return "ScheduleEntity [id=" + id + ", electionName=" + electionName + ", electionDate=" + electionDate
				+ "]";
	}

	public ScheduleEntity(int userId, @NotNull(message = "electionName is mandatory") String electionName,
			@NotNull(message = "electionDate is mandatory") LocalDate electionDate) {
		super();
		this.id = id;
		this.electionName = electionName;
		this.electionDate = electionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getElectionName() {
		return electionName;
	}

	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}

	public LocalDate getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(LocalDate electionDate) {
		this.electionDate = electionDate;
	}

}
