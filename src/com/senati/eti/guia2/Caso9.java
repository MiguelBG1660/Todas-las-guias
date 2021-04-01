package com.senati.eti.guia2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("Alumno: ");
		String nombre = sc.nextLine();
		
		System.out.println("Nota 1...........................: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Nota 2..........................: ");
		float nota2 = sc.nextFloat();

		System.out.println("Asistencia [1-12]..........: ");
		float na = sc.nextFloat();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float pa = na / 12;
		String estado = "Desaprobado";
		if(promedio >= 13 && pa >= 0.7)
			estado = "Aprobado";
		
		System.out.println("\n====== Resultados ====== ");
		System.out.println("Alumno...................: " + nombre);
		System.out.println("Promedio.............: " + df.format(promedio));
		System.out.println("Asistencia......: " + df.format(pa * 100) + "%");
		System.out.println("Estado.........................: " + estado);
		
		

	}

}
