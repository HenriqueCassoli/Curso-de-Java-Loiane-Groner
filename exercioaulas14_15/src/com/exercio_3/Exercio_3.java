package com.exercio_3;

import java.util.Scanner;

public class Exercio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá dia seu sexo");
		
		String sexo = scan.nextLine();
		
		if (sexo.equalsIgnoreCase("f")){
            System.out.println("F - feminino");
        } else if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }
		}
    

	}

