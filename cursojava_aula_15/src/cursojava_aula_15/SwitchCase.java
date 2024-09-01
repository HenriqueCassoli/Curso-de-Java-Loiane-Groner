package cursojava_aula_15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1-7):");
		
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		  case 1: System.out.println("Dominingo");break;
		  case 2: System.out.println("Segundo");break;
		  case 3: System.out.println("Terça");break;
		  case 4: System.out.println("Quarta");break;
		  case 5: System.out.println("Quinta");break;
		  case 6: System.out.println("Sexta");break;
		  case 7: System.out.println("Sabádo");break;
		  default:System.out.println("Não é um dia da semana válido");
		}

	}

}