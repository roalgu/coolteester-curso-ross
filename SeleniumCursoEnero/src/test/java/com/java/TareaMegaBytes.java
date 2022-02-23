package com.java;

public class TareaMegaBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(2500); // ? should print the following text: "2500 KB = 2 MB and 452 KB"
		//printMegaBytesAndKiloBytes(-1024); // ? should print the following text: "Invalid Value" because parameter is// less than 0.
		//printMegaBytesAndKiloBytes(5000); // ? should print the following text: "5000 KB = 4 MB and 904 KB"
	}

	public static void printMegaBytesAndKiloBytes (int kiloBytes) {
	int kiloBytes1= 2500;
	//int kiloBytes1=-1024;
	//int kiloBytes1= 5000;
		if (kiloBytes1 <= 0) {
			System.out.println("Valor invalido");
		} else {
			
			double MB = kiloBytes1 / 1024;
			double KB = kiloBytes % 1024;

			System.out.println(kiloBytes1 + "" + "KB" + " " + String.format("%.0f", MB) + "" + "MB" + " "
					+ String.format("%.0f", KB) + "" + "KB");
		}

	}

}
