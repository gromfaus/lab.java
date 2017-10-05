package com.aleksey;

public class Runner {

	public static void main(String[] args) {
		
		Race[] list = new Race[10];
		
		for (int i = 0; i < 10; i++) {
			
			list[i] = new Race("20.10.2017", 100, true); 
			
		}
		//list[9].setPrize(false);
		//list[9].setParticipants(700);
		
		int totalParticipants = 0;
		int totalHasPrize = 0;
		
		for (int i = 0; i < 10; i++) {
			
			totalParticipants += list[i].getParticipants();
			if (list[i].hasPrize()) totalHasPrize++;
			
		}
		
		System.out.println("Total participants count: " + totalParticipants);
		System.out.println("Total has prize races count: " + totalHasPrize);
		
	}

}
