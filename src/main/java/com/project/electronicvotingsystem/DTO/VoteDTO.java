
	package com.project.electronicvotingsystem.DTO;

	import javax.persistence.Entity;

	public class VoteDTO {
		
		private String partyName;
		
		private int count;

		public String getPartyName() {
			return partyName;
		}

		public void setPartyName(String partyName) {
			this.partyName = partyName;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public VoteDTO(String partyName, int count) {
			super();
			this.partyName = partyName;
			this.count = count;
		}

		public VoteDTO() {
			super();
		}

		@Override
		public String toString() {
			return "VoteDTO [partyName=" + partyName + ", count=" + count + "]";
		}

			
		
	}


