package com.java;

public class CocheVelocidad {

	public static void main(String[] args) {
		// Crear un programa que valide el limite de velocidad 
		//de un coche cuando vaya en una 
		//carretera, zona escolar o calle normal utilizando
		//estructuras condicionales con IF
		
		int velocidadActual = 40; //KM*H
		boolean carretera = true; //Si le pongo falso no realiza nada porque no esta declarado en ninguna condicion
			
		if (carretera == true && velocidadActual <=20 ) {
			System.out.println("Vas en Zona Escolar"); //<=20
		} else if (carretera == true && velocidadActual >20 && velocidadActual <=50 ) {
			System.out.println("Vas en Zona Residencial"); //>20 <=50
		}else {
			System.out.println("Vas en Carretera");
	}
	}
}



