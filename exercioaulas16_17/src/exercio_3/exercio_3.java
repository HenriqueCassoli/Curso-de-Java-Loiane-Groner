package exercio_3;

import java.util.Scanner;

public class exercio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = true;
		String name;
		int age;
		double salary;
		char sex;
		char eCivil;
		
	
		
		while(infoValidas) {
			
			System.out.println("passe seu nome");
			name = scan.nextLine();
			
			
			
			if(name.length() > 3) {
				 //infoValidas = false;
                System.out.println("nome correto .");
			}else {
				System.out.println("nome erro .");
				System.out.println("passe seu nome");
				name = scan.nextLine();
			}
			
			System.out.println("passe seu sua idade");
			age = scan.nextInt();
			
			if(age <= 150 || age < 0) {
				 //infoValidas = false;
               System.out.println("idade correto .");
			}else {
				System.out.println("idade erro .");
				System.out.println("passe seu sua idade");
				age = scan.nextInt();
			}
			
			infoValidas = false;
		}
		
		System.out.println("Passou");

	}

}