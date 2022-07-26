package com.project.electronicvotingsystem.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


public class ScheduleDTO {
	
	@Id
	private int userId;
	
	@NotNull(message="Constituency is mandatory")
	private String Constituency;

	
	public ScheduleDTO() {
		super();
	}

	public ScheduleDTO(int userId, @NotNull(message = "Constituency is mandatory") String constituency) {
		super();
		this.userId = userId;
		Constituency = constituency;
	}

	@Override
	public String toString() {
		return "ScheduleDTO [userId=" + userId + ", Constituency=" + Constituency + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getConstituency() {
		return Constituency;
	}

	public void setConstituency(String constituency) {
		Constituency = constituency;
	}
	
	
}
