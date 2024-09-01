package com.exercio_4;

import java.util.Scanner;

public class Exercio_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       
		String letra = scan.nextLine();
		
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":System.out.println("vogal");break;
		default:System.out.println("consoante");
		}
	}

}
