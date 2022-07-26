package com.project.electronicvotingsystem.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class PartyDTO {
	
	@Id
	private int partyId;

	@NotNull(message="party is mandatory")
	private String partyName;

	@NotNull(message="leader is mandatory")
	private String leader;

	@NotNull(message="symbol is mandatory")
	private String symbol;

	public PartyDTO(int partyId, @NotNull(message = "party is mandatory") String partyName,
			@NotNull(message = "leader is mandatory") String leader,
			@NotNull(message = "symbol is mandatory") String symbol) {
		super();
		this.partyId = partyId;
		this.partyName = partyName;
		this.leader = leader;
		this.symbol = symbol;
	}

	public PartyDTO() {
		super();
	}

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	

}
