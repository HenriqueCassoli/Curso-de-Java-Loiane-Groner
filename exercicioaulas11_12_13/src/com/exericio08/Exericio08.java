package com.exericio08;

import java.util.Scanner;

public class Exericio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double horaGanha , horaTrabalhado, resultado;
		
		
		System.out.println("qualto você ganha por hora trabalhada ?");
		
		horaGanha = scan.nextDouble();
		
		System.out.println("quantas horas você trabalha por mês ?");
		
		horaTrabalhado = scan.nextDouble();
		
		resultado = horaGanha * horaTrabalhado;
		
		System.out.println("é " + resultado);
	}

}
