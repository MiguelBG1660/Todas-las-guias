package com.senati.eti.guia1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Horas Trabajadas........: ");
		int horas = sc.nextInt();
		
		System.out.print("Ingrese Tarifa por Hora.........: ");
		float tarifa = sc.nextFloat();
		
		
		float sueldo = tarifa * horas;
		float bono   = sueldo * 0.05f;
		float total  = bono + sueldo;
		float dolar  = total / 3.24f;
		
		System.out.println("\n- - - - - - - - - - ");
		System.out.println("RESULTADOS");
		System.out.println("- - - - - - - - - - ");
		System.out.println("Sueldo..........: " + sueldo);
		System.out.println("Bono.............: " + bono );
		System.out.println("Total............: " + total );
		System.out.println("Total en dolares : " + df.format(dolar));
		
		
		

	}

}
