package com.senati.eti.guia4;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"A-123", "A-456","A-789", "A-777"};
		String[] arrNombre = {"Joe Castillo", "Rosa Flores", "Ricardo Montes", "Teresa Morales"};
		int[] arrNota = {15, 8, 17, 11};
		
		System.out.println("BUSQUEDA DE DATOS");
		System.out.println("----------------------------");
		System.out.print("Codigo a buscar:             ");
		String codigo = sc.nextLine();   
		
		int pos = -1;
		
		for ( int x = 0; x <= arrCodigo.length - 1; x++) {
			if (codigo.equals(arrCodigo[x])) {
				pos = x;
				break;
			}
		}
		
		if (pos == -1) {
			System.out.println("\n--------------------------------");
			System.out.println("CODIGO NO ENCONTRADO");
			System.out.println("-----------------------------------");
		}
		else { 
			System.out.println("\n------------------------------");
			System.out.println("CODIGO ENCONTRADO");
			System.out.println("---------------------------------");
			System.out.println("Codigo.............: " + arrCodigo[pos]);
			System.out.println("Nombre.............: " + arrNombre[pos]);
			System.out.println("Nota.............: " + arrNota[pos]);
		}
	}

}
