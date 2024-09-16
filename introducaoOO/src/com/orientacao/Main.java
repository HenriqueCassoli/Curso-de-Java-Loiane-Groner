package com.orientacao;

public class Main {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "fiat";
        van.modelo = "ducato";
        van.numPassagereios = 10;
        van.capCombustivel = 100;
        van.consumoCompustivel=0.2;

        System.out.println(van.marca);
    }
}
