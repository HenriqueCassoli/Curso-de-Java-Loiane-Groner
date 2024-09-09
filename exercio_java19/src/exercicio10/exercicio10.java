package exercicio10;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length;i++){
            System.out.println("coleque o seu numero "+i);
            vetorA[i] = scan.nextInt();

            vetorB[i] =vetorA[i] % 2;
        }

        System.out.println("vetor:B");
        for (int i=0;i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(" ");
    }
}
