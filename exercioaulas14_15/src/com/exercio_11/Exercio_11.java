package com.exercio_11;

import java.util.Scanner;

public class Exercio_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá informe seu salário");
		
		double salario = scan.nextDouble();
		double salarioFinal = 0;
		
		if(salario <= 280) {
			System.out.println(salario);
			System.out.println("20%");
			
			 salarioFinal = salario * 1.20;
			
			salarioFinal =  Math.round(salarioFinal * 100.0) / 100.0; 
			
			double aumento = salarioFinal - salario;
			System.out.println(aumento);
			System.out.println(salarioFinal);
		}else if(salario > 280 && salario <= 700 ){
			System.out.println(salario);
			System.out.println("15%");
			
			 salarioFinal = salario * 1.15;
				
				salarioFinal =  Math.round(salarioFinal * 100.0) / 100.0; 
				
				double aumento = salarioFinal - salario;
				System.out.println(aumento);
				System.out.println(salarioFinal);
			
		}else if(salario > 700 && salario < 1500){
			System.out.println(salario);
			System.out.println("10%");
			
			salarioFinal = salario * 1.10;
				
			salarioFinal =  Math.round(salarioFinal * 100.0) / 100.0; 
				
			double aumento = salarioFinal - salario;
			System.out.println(aumento);
			System.out.println(salarioFinal);
			
		}else if(salario >= 1500) {
			System.out.println(salario);
			System.out.println("5%");
			
			salarioFinal = salario * 1.05;
				
			salarioFinal =  Math.round(salarioFinal * 100.0) / 100.0; 
				
			double aumento = salarioFinal - salario;
			System.out.println(aumento);
			System.out.println(salarioFinal);
		}

	}

}
