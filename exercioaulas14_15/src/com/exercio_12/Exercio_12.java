package com.exercio_12;

import java.util.Scanner;

public class Exercio_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Olá informe seu salário");
		
        double salarioBruto = scan.nextDouble();
		
		
		if(salarioBruto <= 900) {
			System.out.println("Sálario bruto "+salarioBruto);
			
			double iR =  salarioBruto * 1;
			System.out.printf("IR %.2f",iR);
			
			double inss = salarioBruto * 1.10;
			System.out.printf("inss  %.2f",inss);
			System.out.println(" ");
			double fgts = salarioBruto * 1.11;
			System.out.printf("fgts %.2f",fgts);
			System.out.println(" ");
			double totalDescontos = inss + iR;
			System.out.printf("%.2f",totalDescontos);
			System.out.println(" ");System.out.println(" ");
			double salarioLiquido = salarioBruto - totalDescontos;
		    System.out.printf("%.2f",salarioLiquido);
		}
	}

}
