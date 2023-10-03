package com.claudioconti.aprendendospring.game;

public class Super implements GameConsole {
    // Métodos
    public void cima(){
        System.out.println("Cima!");
    }
    public void baixo(){
        System.out.println("Agache!");
    }
    public void esquerda(){
        System.out.println("Recuar!");
    }
    public void direita(){
        System.out.println("Atirar!");
    }
}
