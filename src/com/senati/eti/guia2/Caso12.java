package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Empleado.............: ");
		String nombre = sc.nextLine();
		
		System.out.println("Nivel [1-4]............: ");
		int nivel = sc.nextInt();
		
		System.out.println("Sueldo...................: ");
		float sueldo = sc.nextFloat();
		
		float inc = 0;
		
		switch (nivel) {
		       case 1:
		    	   inc = (float)4.5;
		    	   break;
		       case 2:
		    	   inc = (float)6.0;
		    	   break;
		       case 3:
		    	   inc = (float)8.5;
		    	   break;
		       case 4:
		    	   inc = (float)11.0;
		    	   break;
		       default:
		    	   inc = 0;
		}
		float inc1=(sueldo*inc)/100;
		float ns=(float)(sueldo+inc1);
		
		System.out.println("\n====== Resultados ====== ");
		System.out.println("Empleado.................: "+nombre);
		System.out.println("Nivel.............................: "+ nivel);
		System.out.println("Sueldo.........................: "+sueldo);
		System.out.println("Incremento.............: "+ inc + "%");
		System.out.println("Nuevo sueldo.....................: "+ ns);
		
		
		
		


	}

}
