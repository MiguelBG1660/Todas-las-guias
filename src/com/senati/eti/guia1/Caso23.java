package com.senati.eti.guia1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat redondeo = new DecimalFormat("#.00");
		
		System.out.println("Ingrese el nombre del producto: ");
		String producto = sc.nextLine();
		
		System.out.println("Ingrese el precio: ");
		float precio = sc.nextFloat();
		
		System.out.println("Ingrese la cantidad: ");
		int cantidad = sc.nextInt();
		
		float importe = cantidad * precio;
		
		float igv = importe * 0.18f;
		
		float descuento = importe * 0.03f;
		
		System.out.println("========== R E S U L T A D O S ==========");
		System.out.println("Importe................: " + redondeo.format(importe));
		System.out.println("IGV.................: " + redondeo.format(igv));
		System.out.println("Descuento...............: " + redondeo.format(descuento));
		System.out.println("Total Neto.............: " + redondeo.format(importe - descuento + igv));

	}

}
