package exercio_4;

public class Exercio_4 {

	public static void main(String[] args) {
		
		double a =  80000;
		double b = 200000;
		int cont = 0;
		for(int i = 0;a < b;i++) {
			
			a += (80000/100) * 3;
			b += (200000/100) * 1.5;		
			cont++;
		}
		
		a += (80000/100) * 3;
		b += (200000/100) * 1.5;
		System.out.println("populacão "+a);
		System.out.println("populacão "+b);
		System.out.println("entrei em for");
		System.out.println("anos "+ cont);
		
		System.out.println("acabou o for");
	}

}
