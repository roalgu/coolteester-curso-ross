package com.java;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class MetodoSumaOdd {
	public static void main(String[] args) {
		// isOdd(3);
		sumOdd(1, 10);
	}

	public static void isOdd(int number) {
		boolean val = true;

		if (val == number > 0 && number % 2 == 1) { // Check that number is > 0, if it is not return false.
			System.out.println("True"); // Si el número es mayor a cero y si el numero es impar
		} else {
			System.out.println("False"); // Si no es menor a cero es falso y si es par
		}

	}

	public static void sumOdd(int x, int y) {
		
		for (int i = x; i <= y; i++) 
		if (i=isOdd ){
			System.out.println(i + "  ");

		}
	}
}
