package com.senati.eti.guia5;

import java.util.Scanner;

import com.senati.eti.model.Calculadora2;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		float n1 = sc.nextFloat();
		System.out.print("Numero 2: ");
		float n2 = sc.nextFloat();
		
		Calculadora2 calc = new Calculadora2(n1, n2);
		
		System.out.println("\n  **  NUMEROS INGRESADOS  **  ");
	    System.out.println("----------------------------------------");
		System.out.println("Primer numero.......................: " + calc.getNumero1());
		System.out.println("Segundo numero....................: " + calc.getNumero2());
		
		System.out.println("  **  RESULTADOS  **  ");
		System.out.println("----------------------------------------");
		
		System.out.println("1. Suma................: "+ calc.Operar(1));
		System.out.println("2. Resta................: "+ calc.Operar(2));

	}

}
