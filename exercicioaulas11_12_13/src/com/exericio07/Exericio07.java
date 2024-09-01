package com.exericio07;

import java.util.Scanner;

public class Exericio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double base , resultado01 ,resultado02 ;
		
		System.out.println("informe a base do quadrado");
		
		base = scan.nextDouble();
		
		resultado01 = base * base;
		
	    resultado02 = resultado01 * 2;
	    
	    System.out.println("o resultado é " + resultado02);
	}

}
