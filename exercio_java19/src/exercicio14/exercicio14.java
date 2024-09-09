package exercicio14;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        double soma = 0;
        int cont = 0;
        double resultado = 0;
        for(int i = 0;i < vetorA.length; i++){
            System.out.println("coloque seu número "+i);
            vetorA[i] = scan.nextInt();
        }

        for(int i = 0;i < vetorA.length; i++){
            if(vetorA[i] % 2 == 1){
                System.out.println("numeros utilizandos " + i);
                soma += vetorA[i];
                cont++;
            }
            resultado = soma / cont;
        }
        System.out.println(cont);
        System.out.println("resultado "+resultado);
    }
}
