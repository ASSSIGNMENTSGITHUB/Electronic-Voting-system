package com.project.electronicvotingsystem.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class CandidateDTO {
	
	@Id
	private int id;

	@NotNull(message="name is mandatory")
	private String name;

	@NotNull(message="address is mandatory")
	private String address;

	@NotNull(message="party is mandatory")
	private String party;

	@NotNull(message="age is mandatory")
	private String age;

	@NotNull(message="contact is mandatory")
	private String contact;

	public CandidateDTO() {
		super();
	}

	public CandidateDTO(int id, @NotNull(message = "name is mandatory") String name,
			@NotNull(message = "address is mandatory") String address,
			@NotNull(message = "party is mandatory") String party, @NotNull(message = "age is mandatory") String age,
			@NotNull(message = "contact is mandatory") String contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.party = party;
		this.age = age;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "CandidateEntity [id=" + id + ", name=" + name + ", address=" + address + ", party=" + party + ", age="
				+ age + ", contact=" + contact + "]";
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

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
}
