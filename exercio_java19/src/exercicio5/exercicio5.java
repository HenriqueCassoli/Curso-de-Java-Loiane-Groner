package exercicio5;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i=0 ;i < vetorA.length; i++){
            System.out.println("coloque o numero "+i);
            vetorA[i] = scan.nextInt();

            vetorB[i]=vetorA[i] * i;
        }

        System.out.println("vetor:A");
        for (int i=0;i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");

        System.out.println("vetor:B");
        for (int i=0;i <vetorB.length; i++){
            System.out.println(vetorB[i]+" ");
        }
    }
}
