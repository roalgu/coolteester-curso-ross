package com.java;

public class VerificadorNumeros {
	public static void main(String[] args) {
		imprimirVerificadorNumeros();
	}

	public static void imprimirVerificadorNumeros() {
		int num1 =0;
		int num2 =0;
		int num3 =0;

		if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("Los numeros son iguales");// True
		} if (num1==0 ||num2 ==0||num3==0 ) {
			System.out.println("Valor no v�lido");
		} if (num1!=num2&&num1!=num3&&num2!=num3) {
			System.out.println("Todos los n�meros son diferentes");
		} else if (num1!=num2||num1!=num3||num2!=num3) {
				System.out.println("Ni todos son iguales o diferentes");// False
		}

	}
}




