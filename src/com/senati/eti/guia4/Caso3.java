package com.senati.eti.guia4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] numeros = new Integer[5];
		
		for ( int x = 0; x <= numeros.length - 1; x++) {
			System.out.print("Ingrese numero " + (x + 1) + ": ");
			numeros[x] = sc.nextInt();
		}
		
		// Ordenar de forma ascendente
		Arrays.sort(numeros);
		
		System.out.println("NUMEROS ORDENADOS DE FORMA ASCENDENTE");
		System.out.println("--------------------------------------------------------------");
		for (int x = 0; x < numeros.length; x++)
			System.out.println("Numero " + (x + 1) + ": " + numeros[x]);
		
	    // Ordenar de forma descendente
		Arrays.sort(numeros, Collections.reverseOrder());
		
		System.out.println("NUMEROS ORDENADOS DE FORMA DESCENDENTE");
		System.out.println("----------------------------------------------------------------");
		for (int x = 0; x < numeros.length; x++)
			System.out.println("Numero " + (x + 1) + ": " + numeros[x]);	
	}

}
