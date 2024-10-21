package com.exercicios1;

public class Lampada {

    String modelo;
    String tenso;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMesses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }
}
