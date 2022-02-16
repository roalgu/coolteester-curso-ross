package com.java;

public class printMegaBytesAndKiloBytes {

	public static void main(String[] args) {
		// 1 MB = 1024 KB
		int kiloBytes = 2500;
		
		if (kiloBytes <= 0) {
			System.out.println("Valor invalido");
		} else {

			double mult = kiloBytes * 1;
			double div = mult / 1024;

			double mult2 = div * 1024;
			double div2 = mult2 / 1;

			System.out.println(kiloBytes + "" + "KB" + " " + String.format("%.0f", div) + "" + "MB" + " "
					+ String.format("%.0f", div2) + "" + "KB");
		}
	}

}
	
