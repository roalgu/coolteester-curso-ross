package com.java;

import java.util.Scanner;

public class Ejercicio5ValorImpar {

	public static void main(String[] args) {
		// Crea un programa donde te pida un n�mero y 
		//muestra si es positivo o negativo y si es par o impar 
		
			Scanner escaner = new Scanner(System.in);
			System.out.println("Escribe un n�mero:");
			double numero = escaner.nextDouble();
			if (numero ==0) {
					System.out.println("El n�mero es neutro");
						} else if (numero < 0) {
					System.out.println("El n�mero es negativo");
			} else {
					System.out.println("El n�mero es positivo");
			}
			if (numero%2==0) {
					System.out.println("El n�mero "+numero+" es par");
			} else {
				System.out.println("El n�mero "+numero+" es impar");
			}
			}
				
	}
