package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		   System.out.print("Ingrese numero 1.....: ");
		   int n1 = sc.nextInt();
		   
		   System.out.print("Ingrese numero 2.....: ");
		   int n2 = sc.nextInt();
		   
		   System.out.print("Ingrese numero 3.....: ");
		   int n3 = sc.nextInt();
		   
		   System.out.print("Ingrese numero 4.....: ");
		   int n4 = sc.nextInt();
		   
          String estado = "";
		   
		   if (n1 == n2 && n1 == n3 && n1 == n4)
			   estado = "Los tres numeros son iguales";
		   else if (n1 > n2 && n1 > n3)
				   estado = "El primer numero " + n1 + " es mayor. ";
		   else if (n2 > n1 && n2 > n3)
			   estado = "El segundo numero " + n2 + " es mayor. ";
		   else if (n3 > n2 && n3 > n4)
			   estado = "El tercer numero " + n3 + " es mayor. ";
		   else 
			   estado = "El cuarto  numero " + n4 + " es mayor. ";
		   
		   System.out.println("\n====== Resultados ====== ");
		   System.out.println("Estado....: " + estado);
		   
		   
		   

	}

}
