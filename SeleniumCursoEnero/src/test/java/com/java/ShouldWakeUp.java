package com.java;

public class ShouldWakeUp {

	public static void main(String[] args) {
		boolean barking = true;
		int hourOfDay = 8;
		
		// the dog is barking before 8 or after 22 hours so in that case return true
		if (barking == true && hourOfDay >= 0 && hourOfDay <= 23) {
			if (barking == true && hourOfDay <= 8 && hourOfDay >= 22) {
				System.out.println("Wake up!!!!"); // True
			} else {
				System.out.println("Don´t wake up!!!");//False
			}
		} else {
			System.out.println("Valor Invalido");
		}
	}
}
