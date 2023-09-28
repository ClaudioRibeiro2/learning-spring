package com.claudioconti.aprendendospring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    // Atributos
    private GameConsole jogo; // Recebe valor de GameConsone e armazena em jogo.

    // Construtor
    // Constrói o objeto e o @Qualifier define qual jogo vai ser utilizado
    public GameRunner(@Qualifier("mario") GameConsole game) {
        this.jogo = game;
    }

    // Métodos
    public void iniciar() {
        System.out.println("Inicializando jogo: " + jogo);
        jogo.cima();
        jogo.baixo();
        jogo.esquerda();
        jogo.direita();
    }
} // Fim da classe GameRunner
// public e private são MODIFICADORES DE ACESSO
