package com.java;

public class GatosVeranoTemperatura {
	
	public static void main(String[] args) {
		isCatPlaying();
	}

	public static void isCatPlaying() {
		int temperatura = 56;
		boolean verano = true; // Si le pongo falso no realiza nada porque no esta declarado en ninguna
									// condicion

		if (verano == true && temperatura >= 25 && temperatura <=35) {
			System.out.println("Verdadero estan jugando"); // <=20
		} else {
			System.out.println("Falso no estan jugando");
		}
	}
}

