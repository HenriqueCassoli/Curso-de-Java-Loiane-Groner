package exercio_1;

import java.util.Scanner;

public class Exercio_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
          
		System.out.println("Me mostre o número e 0 a 10");
		
		int nota = scan.nextInt();
		
		while(nota > 10 || nota < 0) {
			System.out.println("nota invalida");
			nota = scan.nextInt();
		}
		
		System.out.println("sua nota é valida " + nota);
	}

}
