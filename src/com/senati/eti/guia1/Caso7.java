package com.senati.eti.guia1;

import  java.text.DecimalFormat ;

public class Caso7 {

	public static void main(String[] args) {
        DecimalFormat df =  new  DecimalFormat ( " # .0 " );
		
		float pr1 = ( float ) (( 17  *  2 ) + ((( Math . pow ( 3 , 2 )) -  6 )));
		float pr2 = ( float ) ( 4.7  - ( 1.2  *  2 ));
		float rpta = ( float ) ((pr1 /  5 ) - ( 2  * pr2));
		
		System.out.println("======= R E S U L T A D O S =======");
		System.out.println("Respuesta: " + df.format(rpta));
 
	}

}
