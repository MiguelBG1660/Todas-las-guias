package com.senati.eti.guia1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Monto 1..................: ");
		float n1 = sc.nextFloat();

		System.out.print("Monto 2..................: ");
		float n2 = sc.nextFloat();

		System.out.print("Monto 3..................: ");
		float n3 = sc.nextFloat();
		
		float p1 = (n1 / 5) + (float)(n2 * 0.20) ;
		float p2 = (n3 +(float) (n3 * 0.60)) / 2;
		float suma = n1 + n2 + n3;
		float p3 = suma -(float) (suma * 0.08);
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Caso 1 :......."+ p1);
		System.out.println("Caso 2 :......."+ p2);
		System.out.println("Caso 3 :......."+ p3);

	}

}
