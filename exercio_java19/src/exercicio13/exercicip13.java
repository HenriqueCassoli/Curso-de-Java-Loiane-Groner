package exercicio13;

import java.util.Scanner;

public class exercicip13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;
        for (int i=0;i < vetorA.length;i++){
            System.out.println("coloque o número "+i);
            vetorA[i] = scan.nextInt();

        }

        for(int i=0; i < vetorA.length;i++ ){
                if(vetorA[i] % 5 == 0){
                  soma += vetorA[i];
                    System.out.println("numeros é 5 "+vetorA[i]);
                }
        }

        System.out.println("a soma total é "+soma);
    }
}
