package com.java;

public class TareaVerificadorNumeros {
	public static void main(String[] args) {
		imprimirVerificadorNumeros();
	}

	public static void imprimirVerificadorNumeros() {
		int num1 =1;
		int num2 =2;
		int num3 =3;

		if (num1<0 ||num2 <0||num3<0 ) {
			System.out.println("Valor no válido");
		}
		else if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("Todos los numeros son iguales");// True
		}  else if (num1!=num2&&num1!=num3&&num2!=num3) {
			System.out.println("Todos los números son diferentes");
		} else {
				System.out.println("Ni todos son iguales o diferentes");// False
		}

	}
}




