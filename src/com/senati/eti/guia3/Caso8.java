package com.senati.eti.guia3;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero..........: ");
		int n = sc.nextInt();
		
		System.out.println("Tabla de multiplicar del " + n);
		System.out.println("-----------------------------");
		
		for (int i = 1; i <= 15; i++)
			System.out.println(n + " x " + i + " = " + (n * i));
	}

}
