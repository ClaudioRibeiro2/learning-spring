package com.claudioconti.aprendendospring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component cria uma instância de uma classe automaticamente para ser gerenciada no Spring Container
@Component
public class GameRunner {
    // Atributos
    private final GameConsole jogo; // Recebe valor de GameConsone e armazena em jogo.
    // final é uma variável que só pode ser definida uma vez.

    // Construtor
    public GameRunner(@Qualifier("mario") GameConsole a) { // @Qualifier define qual jogo vai ser utilizado
        this.jogo = a;
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
