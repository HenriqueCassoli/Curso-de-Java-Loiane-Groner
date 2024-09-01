package com.exericio04;

import java.util.Scanner;

public class Exericio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
       int notaBi1 , notaBi2,notaBi3,notaBi4 ,resultado;
       
       System.out.print("nota do primeiro bimestre");
       notaBi1 = scan.nextInt();
       System.out.print("nota do segundo bimestre");
       notaBi2 = scan.nextInt();
       System.out.print("nota do terceiro bimestre");
       notaBi3 = scan.nextInt();
       System.out.print("nota do quarto bimestre");
       notaBi4 = scan.nextInt();
       
       resultado = (notaBi1 + notaBi2 + notaBi3 + notaBi4)/4;
       
       System.out.print("sua media é "+resultado);
	}

}
