package com.java;

public class Arreglos {

	public static void main(String[] args) {
		// El public, es para que corra mi codigo
			
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		int []	 numero = {1,2,3,4,5,6,100};	
		boolean [] algo = {true, true, false, true};
		System.out.println ("El dia de hoy es: "+dias[5]);		
		
		for (int i =0; i<dias.length; i++)  {
			System.out.println(dias[i]);
		}
		//Arreglo Bidimensional
		String [] [] nombres = new String[2][2];
		nombres [0][0] = "Mechuda";
		nombres [0][1] = "Mayte";
		nombres [1][0] = "Roms";
		nombres [1][1] = "Amor";
		System.out.println("El nombre de la persona es: "+ nombres [0][0]);
		//Arreglo Multidimensional
		String [][][][] datos = new String [2][2][2][2];
		datos [0][0][0][0] = "Hello1";
		datos [0][0][0][1] = "Hello2";
		datos [0][0][1][0] = "Hello3";
		System.out.println("El mensaje es: "+ datos [0][0][0][0]);
		//Actividad
// IMPRIMIR EL ARREGLO BIDIMENSIONAL UTILIZANDO UN LOOP
		
		
	}

	}


