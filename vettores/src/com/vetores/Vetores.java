package com.vetores;

public class Vetores {

    public static void main(String[] args) {

        double [] temperaturas= new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("o valor da temperatura do dia um é "+temperaturas[0]);
        System.out.println("tamanho do array "+temperaturas.length);
        System.out.println("valores "+temperaturas);

        for(int i=0;i<temperaturas.length; i++){
            System.out.println("o valor da temperatura do dia "+(i+1)+" é de "+temperaturas[i]);
        };

        for(double temp : temperaturas){
            System.out.println(temp);
        };
    }
}
