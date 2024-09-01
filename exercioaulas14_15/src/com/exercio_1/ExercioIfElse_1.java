package com.exercio_1;

import java.util.Scanner;

public class ExercioIfElse_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		if(number1 > number2){
			System.out.println(number1);
		}else if (number2 >number1) {
			System.out.println(number2);
		}else {
			System.out.println("os numeros são iguais");
		}
	}

}
