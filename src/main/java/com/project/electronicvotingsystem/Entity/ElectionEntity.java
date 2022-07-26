package com.project.electronicvotingsystem.Entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ElectionEntity {
	
	@Id
	private int electionId;

	@NotNull(message="electionName is mandatory")
	private String electionName;
	
	@NotNull(message="constituency is mandatory")
	private String constituency;
	
	@NotNull(message="state is mandatory")
	private String state;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
	private ScheduleEntity scheduleEntity;

	public ElectionEntity() {
		super();
	}

	public ElectionEntity(int electionId, @NotNull(message = "electionName is mandatory") String electionName,
			@NotNull(message = "constituency is mandatory") String constituency,
			@NotNull(message = "state is mandatory") String state) {
		super();
		this.electionId = electionId;
		this.electionName = electionName;
		this.constituency = constituency;
		this.state = state;
	}

	@Override
	public String toString() {
		return "ElectionEntity [electionId=" + electionId + ", electionName=" + electionName + ", constituency="
				+ constituency + ", state=" + state + "]";
	}

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	public String getElectionName() {
		return electionName;
	}

	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ScheduleEntity getScheduleEntity() {
		return scheduleEntity;
	}

	public void setScheduleEntity(ScheduleEntity scheduleEntity) {
		this.scheduleEntity = scheduleEntity;
	}
	
	
}
