package com.senati.eti.guia3;

import java.util.*;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		String nombre, estado, pregunta = "S", nom_mayor, nom_menor;
		int nota1, nota2, nota3, asistencia, na, ac, as;
		float p_asistencia, promedio, p_mayor, p_menor;
		na = 0;
		ac = 0;
		as = 0;
	
		ArrayList<Float> lista_promedio = new ArrayList<Float>();
		ArrayList<String> lista_nombre = new ArrayList<String>();

		while(pregunta.equalsIgnoreCase("S")) {
			na++;
			
			System.out.println("========================");
			System.out.println(" R E G I S T R O " + na + ": ");
			System.out.println("========================");
			System.out.print("Nombre del alumno: ");
			nombre = sc.nextLine();
			System.out.print("Nota 1: ");
			nota1 = sc.nextInt();
			System.out.print("Nota 2: ");
			nota2 = sc.nextInt();
			System.out.print("Nota 3: ");
			nota3 = sc.nextInt();
			System.out.print("Asistencia [1-12]: ");
			asistencia = sc.nextInt();
			
			promedio = (nota1*0.2f) + (nota2*0.3f) + (nota3*0.5f);	
			p_asistencia = (asistencia / 12.0f);
			
			if (promedio >= 13 && p_asistencia > 0.7) {
				estado = "Obtiene certificado";
				ac++;
			}
				
			else {
				estado = "Sin certificado";
				as++;
			}
			
			lista_promedio.add((float)promedio);
			lista_nombre.add(nombre);
			
			
			System.out.println("\n============================");
			System.out.println("     R E S U L T A D O S    ");
			System.out.println("============================");
			System.out.println("Promedio: " + df.format(promedio) );
			System.out.println("Asistencia: "+ df.format(p_asistencia * 100.0f) + "%");
			System.out.println("Estado: " + estado);
			System.out.println("========================");
			sc.nextLine();
			System.out.print("¿Deseas registrar a otro alumno? [S/N]: ");
			pregunta = sc.nextLine();

			
		}
		p_mayor = p_menor = lista_promedio.get(0);
		
		for(int i = 0; i < lista_promedio.size(); i++) {
			
			if(lista_promedio.get(i) > p_mayor) 
				p_mayor = lista_promedio.get(i);
			
			else if(lista_promedio.get(i) < p_menor)
				p_menor = lista_promedio.get(i);
		}
		
		nom_mayor = lista_nombre.get(lista_promedio.indexOf((float)p_mayor));
		nom_menor = lista_nombre.get(lista_promedio.indexOf((float)p_menor));
		
		System.out.println();
		System.out.println("====================");
		System.out.println("   R E S U M E N    ");
		System.out.println("====================");
		System.out.println("Número de alumnos: " + na );
		System.out.println("Mayor promedio: " + df.format(p_mayor)  + " pertenece a " + nom_mayor);
		System.out.println("Menor promedio: " + df.format(p_menor) + " pertence a "  + nom_menor);
		System.out.println("Alumnos cretificados: " + ac);
		System.out.println("Alumnos sin cerificado: " + as );

	}

}
