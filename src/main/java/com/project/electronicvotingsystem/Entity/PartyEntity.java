package com.project.electronicvotingsystem.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;



@Entity
public class PartyEntity {
	
	@Id
	private int partyId;

	@NotNull(message="party is mandatory")
	private String partyName;

	@NotNull(message="Leader is mandatory")
	private String leader;

	@NotNull(message="symbol is mandatory")
	private String symbol;	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
	private CandidateEntity candidateEntity;

	public PartyEntity(int partyId, @NotNull(message = "party is mandatory") String partyName,
			@NotNull(message = "Leader is mandatory") String leader,
			@NotNull(message = "symbol is mandatory") String symbol) {
		super();
		this.partyId = partyId;
		this.partyName = partyName;
		this.leader = leader;
		this.symbol = symbol;
	}

	public PartyEntity() {
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

	public CandidateEntity getCandidateEntity() {
		return candidateEntity;
	}

	public void setCandidateEntity(CandidateEntity candidateEntity) {
		this.candidateEntity = candidateEntity;
	}

	

}