package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo.....: ");
	    float sueldo = sc.nextFloat();
		
	    float dscto = 0;
	    		
		if (sueldo > 2800)
			dscto = 0.05f * sueldo;
		
		if (sueldo <= 2800)
			dscto = 0.02f * sueldo;
		
		System.out.println("\n====== Resultados ====== ");
		System.out.println("Impuesto calculado...........: " + dscto);

	}

}
