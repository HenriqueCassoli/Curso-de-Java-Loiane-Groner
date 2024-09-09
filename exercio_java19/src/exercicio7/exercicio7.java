package exercicio7;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for(int i = 0; i < vetorA.length;i++){
            System.out.println("coleque o seu numero "+i);
            vetorA[i] = scan.nextInt();
        }

        for(int i=0;i < vetorB.length;i++){
            System.out.println("coleque o seu numero "+i);
            vetorB[i] = scan.nextInt();

            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("vetor:C");
        for (int i=0;i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println(" ");
    }
}
