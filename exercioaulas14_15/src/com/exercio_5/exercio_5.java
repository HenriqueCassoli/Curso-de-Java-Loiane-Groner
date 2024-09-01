package com.exercio_5;

import java.util.Scanner;

public class exercio_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		double resultado = (nota1 + nota2)/2;
		
		if(resultado == 10 ) {
			System.out.println("aprvado com Distinção");
		}else if(resultado <= 7 ) {
			System.out.println("reprovado");
		}else if(resultado >= 10) {
			System.out.println("Aprovado ");
		}

	}

}
