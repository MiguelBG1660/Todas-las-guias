package com.senati.eti.guia5;

import com.senati.eti.model.Alumno;
import java.util.Scanner;
import java.io.*;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		try {
			archivo = new FileWriter("info.txt", true);
			pw = new PrintWriter(archivo);
			
			System.out.println("REGISTRO DE DATOS");
			System.out.println("==================");
			
			System.out.print("Nombre....................: ");
			String nom = sc.nextLine();
			
			System.out.println("Apellido...............: ");
			String ape = sc.nextLine();
			
			System.out.println("Genero [M-F].......: ");
			String gen = sc.nextLine();
			
			System.out.println("Edad [18-30]..........: ");
			int ed = sc.nextInt();
			
			Alumno alu = new Alumno(nom, ape, gen, ed);
			
			pw.println("Datos Registrados");
			pw.println("---------------------");
			
			pw.println("Nombre y Apellido.............: " + alu.NombreCompleto());
			pw.println("Genero.................................: " + alu.MostarGenero());
			
			System.out.println("El archivo fue creado correctamente....");
		}catch (Exception ex1) {
			ex1.printStackTrace();
		} finally {
			//Cierre del archivo
			try {
				if (archivo != null)
					archivo.close();

	}catch (Exception ex2) {
		ex2.printStackTrace();
	}

}
}
}