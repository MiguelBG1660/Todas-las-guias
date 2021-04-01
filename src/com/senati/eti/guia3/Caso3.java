package com.senati.eti.guia3;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		int factorial = 1;
		int i = 1;
		if (n <= 7 && n >0) {
			while (i <= n) {
				factorial *=i;			 
				i++;
			}
			System.out.print("El factorial "+ n +" es: "+factorial);
		}
		else
			System.out.println("Valor ingresado debe ser entre [1-7]");

	}

}
