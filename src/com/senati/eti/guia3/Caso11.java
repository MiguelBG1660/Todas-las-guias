package com.senati.eti.guia3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        String pregunta = "S";
      
        int i = 1, si = 0;
        float ht =0 , tp = 0,bruto = 0, dsc = 0, min = 0, bon = 0, por_asist = 0, men = 0 , mayo = 0;
        String mayor = "", menor = "", cm = "";
       
        String pre = pregunta.toUpperCase();
        
        while ( pre.equals("S")) {
            
            System.out.println("\n------------------------------");
            System.out.println("Registro de empleado ("+ (i) + "):");
            System.out.println("\n------------------------------");
            System.out.print("Empleado: ");
            String name = sc.nextLine();
            System.out.print("Horas trabajadas: ");
             ht = sc.nextFloat();
             System.out.print("Tarifa por hora :  ");
             tp = sc.nextFloat();
             
             Float [] arrmin = new Float[i];
             
             System.out.print("Minutos de tardanza :  ");
             arrmin[i-1] = sc.nextFloat();
            
            sc.nextLine();
            
             bruto = ht * tp;
             
             if ( ht > 80) bon = bruto *0.15f;
             else if ( ht > 70 && ht <= 80) bon = bruto * 0.13f;
             else if ( ht > 60 && ht <= 70) bon = bruto * 0.08f;
             else if ( ht > 50 && ht <= 60) bon = bruto * 0.02f;
             else bon = 0;
             
             if (arrmin[i-1] <= 15) dsc = 0;
             else if ( arrmin[i-1]  > 15 && arrmin[i-1]  <=  30) dsc = arrmin[i-1] * (bruto*0.03f);
             else if ( arrmin[i-1]  > 30) dsc = arrmin[i-1] * (bruto*0.05f);
             
             Float [] arrneto = new Float[i];
             
             arrneto [i-1] = bruto + bon - dsc;
             
             por_asist = (ht * 100f)/80f;
             
             if ( (i-1) == 0) {
                    mayo = arrneto[i-1];
                    men = arrneto[i-1];
                    min = arrmin[i-1];
                    mayor = name;
                    menor = name;
                    cm = name;
                }
          
             if (arrneto[i-1] < men) {
                 men = arrneto[ i-1];
                 menor = name;
             }
             if (arrneto[i-1] > mayo) {
                 mayo = arrneto[ i-1];
                 mayor = name;
             }
             if (arrmin[i-1] > min) {
                 min = arrmin[ i-1];
                 cm = name;
             }
             
             if ( por_asist >= 90) si = si +1;
            
                System.out.println("\n-------------");
                System.out.println("Resultados");
                System.out.println("\n-------------");
                System.out.println("Sueldo bruto: "+df.format(bruto));
                System.out.println("Bonificacion : "+df.format(bon));
                System.out.println("Descuento : "+df.format(dsc));
                System.out.println("Suelto neto : "+df.format(arrneto[i-1]));
                System.out.println("Asistencia  : "+df.format(por_asist) + "%");
                System.out.println("***********");
                i++;
                System.out.println("\n-------------");
                System.out.print("\n¿Nuevo empleado? [ S/N ] : ");
                pregunta = sc.nextLine();
                
                pre = pregunta.toUpperCase();
        }
        
        System.out.println("\n-------------");
        System.out.println("---RESUMEN---");
        System.out.println("\n-------------");
        System.out.println("Número de empleados: "+(i-1) );
        System.out.println("Sueldo neto mayor : "+ df.format(mayo) + " pertenece a: " + mayor);
        System.out.println("Sueldo neto menor: "+ df.format(men) + " pertenece a: " + menor);
        System.out.println("Empleado con la mayor cantidad de minutos de tandanza : "+ cm + "( " + df.format(min)+ " min.)" );
        System.out.println("Cantidad de empleados con más del 90% de la meta: "+ si );

	}

}
