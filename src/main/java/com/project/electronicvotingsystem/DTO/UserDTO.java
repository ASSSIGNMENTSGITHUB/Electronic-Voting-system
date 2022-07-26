package com.project.electronicvotingsystem.DTO;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


public class UserDTO {
	
	@Id
	private int id;
	
	@NotNull(message="name is mandatory")
	private String name;
	
	@NotNull(message="address is mandatory")
	private String address;
	
	@NotNull(message="DOB is mandatory")
	private LocalDate DOB;
	
	@NotNull(message="gender is mandatory")
	private String gender;
	
	@NotNull(message="constact is mandatory")
	private String constact;
	
	@NotNull(message="district is mandatory")
	private String district;

	public UserDTO() {
		super();
	}

	public UserDTO(int id, @NotNull(message = "name is mandatory") String name,
			@NotNull(message = "address is mandatory") String address,
			@NotNull(message = "DOB is mandatory") LocalDate dOB,
			@NotNull(message = "gender is mandatory") String gender,
			@NotNull(message = "constact is mandatory") String constact,
			@NotNull(message = "district is mandatory") String district) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		DOB = dOB;
		this.gender = gender;
		this.constact = constact;
		this.district = district;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", address=" + address + ", DOB=" + DOB + ", gender="
				+ gender + ", constact=" + constact + ", district=" + district + "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getConstact() {
		return constact;
	}

	public void setConstact(String constact) {
		this.constact = constact;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	
}
