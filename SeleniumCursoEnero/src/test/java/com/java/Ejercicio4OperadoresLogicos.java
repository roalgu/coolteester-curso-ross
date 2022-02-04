package com.java;

public class Ejercicio4OperadoresLogicos {

	public static void main(String[] args) {
		// Declara 2 variables numéricas enteras (con el valor que desees), 
//		he indica cual es mayor de los dos. Si son iguales indicarlo también.
//		Ves cambiando los valores para comprobar que funciona. 
		
		int or = 5;
		int or2 = 20;
		
		if(or > or2) {
			String valor = "es mayor a ";
			System.out.println(or+" " +valor+" "+or2);
		}
		else if (or < or2){
			String valor = "es menor a ";
			System.out.println(or+" " +valor+" "+or2);
		}
		else if (or == or2){
			String valor = "es igual a ";
			System.out.println(or+" " +valor+" "+or2);
		}
		}
		
	}




