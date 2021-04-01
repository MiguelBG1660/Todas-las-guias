package com.senati.eti.guia3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		String empleado, pregunta = "S", nom_mayor, nom_menor, nom_tardanza;
		float tarifa, sueldo_b, bono = 0.0f, p_alcanzado, desc = 0.0f, sueldo_neto, n_mayor, n_menor, n_tardanza, horas_trabajadas = 0.0f, tardanza = 0.0f;
		int ne = 0; 
		int ne_meta = 0;
	
		ArrayList<Float> lista_neto = new ArrayList<Float>();
		ArrayList<Float> lista_tardanza = new ArrayList<Float>();
		ArrayList<String> lista_nombre = new ArrayList<String>();

		while(pregunta.equalsIgnoreCase("S")) {
			ne++;
			
			System.out.println("========================");
			System.out.println(" R E G I S T R O  " + ne + ": ");
			System.out.println("========================");
			System.out.print("Empleado : ");
			empleado = sc.nextLine();
			System.out.print("Horas trabajadas: ");
			horas_trabajadas = sc.nextInt();
			System.out.print("Tarifa por hora: ");
			tarifa = sc.nextFloat();
			System.out.print("Minutos de tardanza: ");
			tardanza = sc.nextInt();
			
			sueldo_b = horas_trabajadas * tarifa;
			p_alcanzado = (horas_trabajadas / 80.0f ) * 100.0f;
			
			
			if(horas_trabajadas < 50) bono = 0.0f;
			else if(horas_trabajadas >= 50 && horas_trabajadas <= 60)
				bono = sueldo_b * 0.02f;
			else if(horas_trabajadas > 60 && horas_trabajadas <= 70)
				bono = sueldo_b * 0.08f;
			else if(horas_trabajadas > 70 && horas_trabajadas <= 80)
				bono = sueldo_b * 0.13f;
			else if(horas_trabajadas > 80 )
				bono = sueldo_b * 0.15f;
			else if(horas_trabajadas > 90 ) {
				bono = sueldo_b * 0.15f;
				ne_meta++;
			}
			lista_nombre.add(empleado);
			
			if(tardanza <= 15) desc = 0.0f;
			else if(tardanza > 15 && tardanza <= 30)
				desc = sueldo_b * (0.003f * tardanza);
			else if(tardanza > 30)
				bono = sueldo_b * (0.005f * tardanza);
			lista_tardanza.add(tardanza);
			
			sueldo_neto = sueldo_b + bono - desc;
			lista_neto.add(sueldo_neto);
			
			System.out.println("\n============================");
			System.out.println("     R E S U L T A D O S    ");
			System.out.println("============================");
			System.out.println("Sueldo Bruto: " + df.format(sueldo_b));
			System.out.println("Bonificación: "+ df.format(bono));
			System.out.println("Descuento: " + df.format(desc));
			System.out.println("Sueldo Neto: " + df.format(sueldo_neto));
			System.out.println("% Alcanzado: " + df.format(p_alcanzado) + "%");
			System.out.println("===========================");
			sc.nextLine();
			System.out.print("¿Nuevo empleado? [S/N]: ");
			pregunta = sc.nextLine();

			
		}
		n_mayor = n_menor = lista_neto.get(0);
		
		for(int i = 0; i < lista_neto.size(); i++) {
			
			if(lista_neto.get(i) > n_mayor) 
				n_mayor = lista_neto.get(i);
			
			else if(lista_neto.get(i) < n_menor)
				n_menor = lista_neto.get(i);
		}
		
		nom_mayor = lista_nombre.get(lista_neto.indexOf(n_mayor));
		nom_menor = lista_nombre.get(lista_neto.indexOf(n_menor));
		
		n_tardanza = lista_tardanza.get(0);
		
		for(int i = 0; i < lista_tardanza.size(); i++) {
			
			if(lista_tardanza.get(i) > n_tardanza) 
				n_tardanza = lista_tardanza.get(i);
		}
		nom_tardanza = lista_nombre.get(lista_tardanza.indexOf(n_tardanza));
		
		System.out.println();
		System.out.println("====================");
		System.out.println("   R E S U M E N    ");
		System.out.println("====================");
		System.out.println("Número de empleados: " + ne );
		System.out.println("Sueldo neto mayor: " + df.format(n_mayor)  + " pertenece a " + nom_mayor);
		System.out.println("Sueldo neto menor: " + df.format(n_menor) + " pertence a "  + nom_menor);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + nom_tardanza + "(" + n_tardanza + " min." + ")");
		System.out.println("Cantidad de empleados con mas del 90% de la meta: " + ne_meta );

	}

}
