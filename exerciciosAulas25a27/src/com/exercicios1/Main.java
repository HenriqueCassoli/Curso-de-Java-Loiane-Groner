package com.exercicios1;

public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();

       System.out.println("Lampada está " + lampada.ligada);

        lampada.desligar();

        System.out.println("Lampada está " + lampada.ligada);
    }
}
