package com.orientacao.objeto;

public class Main {
    public static void main(String[] args) {

        Lampada lampadaClara = new Lampada();

        lampadaClara.marca= "wallmart";
        lampadaClara.modelo="amarelha";
        lampadaClara.preco=18.50;

        System.out.println(lampadaClara.marca);
        System.out.println(lampadaClara.modelo);
        System.out.println(lampadaClara.preco);


    }
}
