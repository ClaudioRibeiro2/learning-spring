package com.claudioconti.aprendendospring.game;

import org.springframework.stereotype.Component;

// Anotação @Component cria uma instância para você automaticamente no Spring Container
@Component
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
