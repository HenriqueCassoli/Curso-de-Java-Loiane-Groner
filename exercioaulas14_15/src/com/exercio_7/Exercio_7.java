package com.exercio_7;

import java.util.Scanner;

public class Exercio_7 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		if(number1 > number2 && number1 > number3) {
			System.out.println("numero um é melhor "+number1);
		}else if(number2 > number1 && number2 >number3){
			System.out.println("numero um é melhor "+number2);
		}else if(number3 > number1 && number3 > number1) {
			System.out.println("numero um é melhor "+ number3);
		}else {
			System.out.println("erro tem coisa igual");
		}
		
		if(number1 < number2 && number1 < number3) {
			System.out.println("numero um é menor "+number1);
		}else if(number2 < number1 && number2 < number3){
			System.out.println("numero um é melhor "+number2);
		}else if(number3 < number1 && number3 < number1) {
			System.out.println("numero um é melhor "+ number3);
		}else {
			System.out.println("erro tem coisa igual");
		}

	}

}
