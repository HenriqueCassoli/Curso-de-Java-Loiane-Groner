package exercicio12;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA= new int[10];
        int resultado = 0;

        for(int i=0;i < vetorA.length; i++){
            System.out.println("coloque na possição");
            vetorA[i] = scan.nextInt();
            resultado +=  vetorA[i];

            System.out.println("A SOMA DE TUDO " + resultado);
        }
    }
}
