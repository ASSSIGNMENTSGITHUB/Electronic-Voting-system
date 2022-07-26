package com.project.electronicvotingsystem.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


public class VoterRequestDTO {
	
	@Id
	private int id;
	
	@NotNull(message="name is mandatory")
	private String name;
	
	@NotNull(message="requestId is mandatory")
	private String requestId;
	
	@NotNull(message="district is mandatory")
	private String district;
	
	@NotNull(message="constituency is mandatory")
	private String constituency;
	
	@NotNull(message="voterId is mandatory")
	private String voterId;
	
	@NotNull(message="applicationStatus is mandatory")
	private String applicationStatus;

	public VoterRequestDTO() {
		super();
	}

	public VoterRequestDTO(int id, @NotNull(message = "name is mandatory") String name,
			@NotNull(message = "requestId is mandatory") String requestId,
			@NotNull(message = "district is mandatory") String district,
			@NotNull(message = "constituency is mandatory") String constituency,
			@NotNull(message = "voterId is mandatory") String voterId,
			@NotNull(message = "applicationStatus is mandatory") String applicationStatus) {
		super();
		this.id = id;
		this.name = name;
		this.requestId = requestId;
		this.district = district;
		this.constituency = constituency;
		this.voterId = voterId;
		this.applicationStatus = applicationStatus;
	}

	@Override
	public String toString() {
		return "VoterRequestEntity [id=" + id + ", name=" + name + ", requestId=" + requestId + ", district=" + district
				+ ", constituency=" + constituency + ", voterId=" + voterId + ", applicationStatus=" + applicationStatus
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
	
	
}
