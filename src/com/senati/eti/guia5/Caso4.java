package com.senati.eti.guia5;

import com.senati.eti.model.Modulo4;

public class Caso4 {
	public static void main(String[] args) {
        Modulo4 [] Listado=new Modulo4[5];
		
		Listado[0]=new Modulo4("Los Perros Hambrientos","Ciro Alegria","1");
		Listado[1]=new Modulo4("Tradiciones Peruanas","Ricardo Palma","1");
		Listado[2]=new Modulo4("Informatica Global","Bill Gates","2");
		Listado[3]=new Modulo4("Los Heraldos Negros","Cesar Vallejo","1");
		Listado[4]=new Modulo4("Rev. Dig. Merca2.0","Mark Zuckerberg","2");
		System.out.println("LISTA DE PUBLICACIONES");
		System.out.println("=========================");
		System.out.println("N.\tTitulo\t\t\tAutor\t\tTipo");
		System.out.println("==\t======\t\t\t=====\t\t=====");
		int a=1;
		for(Modulo4 e: Listado) {	
			System.out.println(a+"\t"+e.getTitulo()+"\t"+
			e.getAutor()+"\t"+e.getTipo());
			a++;
		}

	}

}
