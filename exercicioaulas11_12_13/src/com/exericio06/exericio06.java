package com.exericio06;

import java.util.Scanner;

public class exericio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double raio , resultado;
		
		System.out.println("indique o raio do circulo ?");
		
		raio = scan.nextDouble();
		
		resultado = Math.PI * Math.pow(raio,2);
		
		System.out.println("a area do circulo é " + resultado);
	}

}
