package com.java;

public class TareaA�oBisiesto {
	
	public static void main(String[] args) {
	 isLeapYear (2017);
	}
	public static void isLeapYear (int year) {
		
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) 
		{
			System.out.println("Es a�o bisiesto"); 
		} else {
			System.out.println("No es a�o bisiesto");
		}
	}
	
}
	

