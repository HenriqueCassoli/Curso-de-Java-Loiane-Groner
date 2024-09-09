package exercicio11;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0;i < vetorA.length;i++){
            System.out.println("coloque no possição"+i);
            vetorA[i] = scan.nextInt();
        }

        for(int i=0;i<vetorA.length;i++){
           if(vetorA[i]%2 == 0){
             System.out.println("coloque para " +vetorA[i]);
           }
        }
    }
}
