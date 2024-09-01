package com.exercio_10;

import java.util.Scanner;

public class Exercio_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("em que turno ?");
		String day = scan.nextLine();
		
		switch(day) {
		 case "M":System.out.println("Bom dia");break;
		 case "V":System.out.println("Boa Tarde");break;
		 case "N":System.out.println("Boa Noite");break;
		 default:System.out.println("Valor invalido");break;
		}

	}

}
