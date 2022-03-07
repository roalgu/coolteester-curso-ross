package com.java;

public class TareaAñoBisiesto {
	
	public static void main(String[] args) {
	 isLeapYear (2017);
	}
	public static void isLeapYear (int year) {
		
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) 
		{
			System.out.println("Es año bisiesto"); 
		} else {
			System.out.println("No es año bisiesto");
		}
	}
	
}
	

