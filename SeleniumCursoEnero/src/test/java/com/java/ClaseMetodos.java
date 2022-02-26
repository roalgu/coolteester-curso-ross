package com.java;

public class ClaseMetodos {

	public static void main(String[] args) {
		//Caracteristicas de un metodo
		// 1. Un metodo no puede escribirse fuera de la clase
		// 2. Un metodo no se puede escribir dentro de otro metodo
		// 3. El metodo main es el punto de entrada del programa
		// 4. Un metodo comienza con { y termina con otra }
		// 5. Dentro de un metodo se puede invocar otro metodo
		
		algo();
		printHello();
		int suma = suma (1,2);
		System.out.println(suma);
	}
	public static void printHello() {
	 System.out.println("HELLO");	
	}
	public static int suma(int x, int y) {
		return x+y;
		}
	public static void validateUserLoginPage() {
	}
	
	public static void ishuman() {
		return true;
	}
	
	public static void algo () {
		printHello();

	}
}
