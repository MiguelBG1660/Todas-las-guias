package com.senati.eti.guia3;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menor;
		System.out.print("Ingrese número 1: ");
		int n1 = sc.nextInt();
		
		menor=n1;
		
		for (int i =2; i <=5 ; i++) {
			System.out.print("Ingrese número "+i+" : ");
			int n2 = sc.nextInt();
			if (n2<menor)
				menor=n2;
		}
		System.out.println("El número menor es: "+menor);

	}

}
