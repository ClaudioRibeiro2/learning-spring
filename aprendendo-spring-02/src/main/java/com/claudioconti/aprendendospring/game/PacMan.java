package com.claudioconti.aprendendospring.game;

import org.springframework.stereotype.Component;

// Anotação @Component cria uma instância para você automaticamente no Spring Container
@Component
public class PacMan implements GameConsole{
    // Métodos
    public void cima() {
        System.out.println("Ir para cima!");
    }
    public void baixo() {
        System.out.println("Ir para baixo!");
    }
    public void esquerda(){
        System.out.println("Ir para trás!");
    }
    public void direita(){
        System.out.println("Ir para frente!");
    }
}
