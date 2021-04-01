package com.senati.eti.guia4;

public class Caso6 {

	public static void main(String[] args) {
		// { -> ALT + 123
		// } -> ALT + 125
		String [][] datos = {{"Joe Castillo", "Rosa Flores", "Ricardo Tello"},
		                                  {"Callao", "Comas", "Puente Piedra"}};
		
		// datos.length           -> cantidad de filas de la matriz....(2)
		// datos[0].length      -> cantidad de elementos del arreglo de la primera fila.....(3)
		
		// Impresion de valoress de la matriz por filas
		System.out.println("........IMPRESION POR FILAS.........");
		System.out.println("====================================");
		for (int f = 0; f < datos.length; f++) {
			  for (int c = 0; c < datos[0].length; c++)
				    System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			   System.out.println();
		}
		
		System.out.println();
		
		// Impresion de valoress de la matriz por columnas
				System.out.println("........IMPRESION POR COLUMNAS.........");
				System.out.println("====================================");
				for (int c = 0; c < datos[0].length; c++) {
					  for (int f = 0; f < datos.length; f++)
						    System.out.print(String.format("%-20s", datos[f][c]) + "\t");
					
					System.out.println();
		

	}

}
}