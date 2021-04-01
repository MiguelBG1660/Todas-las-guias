package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso41 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		   
		   System.out.print("Ingrese numero 1.....: ");
		   int n1 = sc.nextInt();
		   
		   System.out.print("Ingrese numero 2.....: ");
		   int n2 = sc.nextInt();
		   
		   System.out.print("Ingrese numero 3.....: ");
		   int n3 = sc.nextInt();
		   
	       String estado = "";
		   
		   if (n1 == n2 && n1 == n3)
			   estado = "Los tres numeros son iguales";
		   else if (n1 < n2 && n1 < n3)
				   estado = "El primer numero " + n1 + " es menor. ";
		   else if (n2 < n1 && n2 < n3)
			   estado = "El segundo numero " + n2 + " es menor. ";
		   else 
			   estado = "El tercer  numero " + n3 + " es menor. ";
		   
		   System.out.println("\n====== Resultados ====== ");
		   System.out.println("Estado....: " + estado);

	}

}
