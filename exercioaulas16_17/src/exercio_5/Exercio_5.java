package exercio_5;

import java.util.Scanner;

public class Exercio_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe a população A");
		int aPop = scan.nextInt();
		System.out.println("informe a população B");
		int bPop = scan.nextInt();
		
		System.out.println("informe a população A");
		int aCrecimento = scan.nextInt();
		System.out.println("informe a população B");
		int bCrecimento = scan.nextInt();
		
		 int cont = 0;
		 
		while(aPop < bPop) {
			aPop += (aPop/100) * aCrecimento;
			bPop += (bPop/100) * bCrecimento;
			cont++;
		}
		
		System.out.println("População A: " + aPop);
        System.out.println("População B: " + bPop);
        System.out.println("Qtd anos:     " + cont);

	}

}
