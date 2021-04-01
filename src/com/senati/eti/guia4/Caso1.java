package com.senati.eti.guia4;

public class Caso1 {

	public static void main(String[] args) {
		String[] nombre = new String[4];
		
		// Asignar valores
		nombre[0] = "Joe Castillo";
		nombre[1 ] = "Rosa Flores";
		nombre[2] = "Carlos Tello";
		nombre[3] = "Ericka Valiente";
		
		for (int x = 0; x < nombre.length; x++)
			System.out.println("Nombre " + (x + 1) + ": " + nombre[x]);
		
		
		
		

	}

}
