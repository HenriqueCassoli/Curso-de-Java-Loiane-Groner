package com.exericio09;

import java.util.Scanner;

public class Exericio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double C , F;
		
		System.out.println("informe a temperatura em fahrenheit");
		
		F = scan.nextDouble();
		
		C = (5*(F-32)/9);
		
		System.out.println("temperatura en celcius " + C);

	}

}
