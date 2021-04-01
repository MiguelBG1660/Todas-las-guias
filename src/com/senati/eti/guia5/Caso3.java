package com.senati.eti.guia5;

import java.util.ArrayList;

import java.util.Scanner;

import com.senati.eti.model.Alumno;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Generar el conjunto de datos de tipo Alumno
		ArrayList<Alumno> arrAlumno = new ArrayList<Alumno>();
		
		//Forma 1 : Crear el objeto de tipo Alumno
		Alumno alum1 = new Alumno();
		
		alum1.setNombre("Joe");
		alum1.setApellido("Castillo");
		alum1.setGenero("M");
		alum1.setEdad(25);
		
		// Forma 2: Crear el objeto de tipo Alumno
		Alumno alum2 = new Alumno("Rosa", "Flores", "F", 15);
	    
	    // Forma 3 : Crear el objeto de tipo Alumno
		Alumno alum3 = null;
		
		String nom = "", ape = "", gen = "";
		int ed = 0;
		
		System.out.println("REGISTRO DE DATOS");
		System.out.println("==================");
		System.out.print("Nombre....................: ");
		nom = sc.nextLine();
		System.out.println("Apellido...............: ");
		ape = sc.nextLine();
		System.out.println("Genero [M-F].......: ");
		gen = sc.nextLine();
		System.out.println("Edad [18-30]..........: ");
		ed = sc.nextInt();
		
		alum3 = new Alumno(nom, ape, gen, ed);
		
		arrAlumno.add(alum1);
		arrAlumno.add(alum2);
		arrAlumno.add(alum3);
		
		System.out.println("\nLISTA DE DATOS REGISTRADOS");
		System.out.println("===========================\n");
		
		String patron = "%-4s %-20s %-10s %-15s";
		
		System.out.println(String.format(patron, "N", "Nombres y Apellidos",
				"Genero", "Estado"));
		System.out.println(String.format(patron, "-", "-------------------",
				"------", "------"));
		
		for (int x = 0; x < arrAlumno.size(); x++)
			System.out.println(String.format(patron, (x + 1), 
					arrAlumno.get(x).NombreCompleto(),
					arrAlumno.get(x).MostarGenero(),
					arrAlumno.get(x).MostrarEstado()));
		
	}

}
