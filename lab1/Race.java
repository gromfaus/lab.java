package com.aleksey;

public class Race {
	
	private String date;
	private int participants;
	private boolean prize;

	
	public Race() {}
	
	public Race(String date, int participants, boolean prize) {
		//super();
		this.date = date;
		this.participants = participants;
		this.prize = prize;
	}

	public String getDate() {
		return date;
	}	
	

	//public void setDate(String date) {
	//	this.date = date;
	//}

	public void setDate(String date) {
		this.date = date;
	}

	public int getParticipants() {
		return participants;
	}
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	public boolean hasPrize() {
		return prize;
	}
	public void setPrize(boolean prize) {
		this.prize = prize;
	}
	
}
