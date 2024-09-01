package com.exericio05;

import java.util.Scanner;

public class Exericio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int metros , resultado;
		
		System.out.println("coloque metros para converter");
		metros = scan.nextInt();
		
		resultado = metros*100;
		
		System.out.println("em comvercão para centimetros é "+resultado);

	}

}
