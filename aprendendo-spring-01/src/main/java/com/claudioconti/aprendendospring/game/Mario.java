package com.claudioconti.aprendendospring.game;

public class Mario implements GameConsole{
    // Métodos
    public void cima(){
        System.out.println("Pule!");
    }
    public void baixo(){
        System.out.println("Pule em um buraco!");
    }
    public void esquerda(){
        System.out.println("Recuar!");
    }
    public void direita(){
        System.out.println("Avante!");
    }
}
