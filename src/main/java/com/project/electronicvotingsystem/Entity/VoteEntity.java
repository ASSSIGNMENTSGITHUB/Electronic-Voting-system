package com.project.electronicvotingsystem.Entity;

	import java.time.LocalDate;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotNull;

	@Entity
	@Table(name="vote")
	public class VoteEntity {
		@Id
		private int id;
		
		@NotNull(message="voterName is mandatory")
		private String voterName;
		
		@NotNull(message="partyName is mandatory")
		private String partyName;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getVoterName() {
			return voterName;
		}

		public void setVoterName(String voterName) {
			this.voterName = voterName;
		}

		public String getPartyName() {
			return partyName;
		}

		public void setPartyName(String partyName) {
			this.partyName = partyName;
		}

		public VoteEntity(int id, @NotNull(message = "voterName is mandatory") String voterName,
				@NotNull(message = "partyName is mandatory") String partyName) {
			super();
			this.id = id;
			this.voterName = voterName;
			this.partyName = partyName;
		}

		public VoteEntity() {
			super();
		}

		@Override
		public String toString() {
			return "VoteEntity [id=" + id + ", voterName=" + voterName + ", partyName=" + partyName + "]";
		}
		
	}



