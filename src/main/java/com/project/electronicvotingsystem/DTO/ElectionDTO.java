package com.project.electronicvotingsystem.DTO;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


public class ElectionDTO {
	
	@Id
	private int electionId;

	@NotNull(message="electionName is mandatory")
	private String electionName;
	
	@NotNull(message="constituency is mandatory")
	private String constituency;
	
	@NotNull(message="state is mandatory")
	private String state;

	public ElectionDTO() {
		super();
	}

	public ElectionDTO(int electionId, @NotNull(message = "electionName is mandatory") String electionName,
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
	
	
}
