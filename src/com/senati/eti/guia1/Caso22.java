package com.senati.eti.guia1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del Alumno:......: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nota 1..................: ");
		float n1 = sc.nextFloat();

		System.out.print("Nota 2..................: ");
		float n2 = sc.nextFloat();

		System.out.print("Nota 3..................: ");
		float n3 = sc.nextFloat();
		
		float p1 = (float) (n1 * 0.20);
		float p2 = (float) (n2 * 0.30);
		float p3 = (float) (n3 * 0.50);
		float promedio = p1 + p2 + p3;
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Nombre del alumno :......."+ nombre);
		System.out.println("Promedio :........."+ df.format(promedio));
		

	}

}
