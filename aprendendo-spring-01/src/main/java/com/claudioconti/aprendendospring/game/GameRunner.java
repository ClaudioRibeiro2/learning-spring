package com.claudioconti.aprendendospring.game;

public class GameRunner {
    // Atributos
    private GameConsole game;

    // Construtor
    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void iniciar() {
        System.out.println("Inicializando jogo: " +  game);
        game.cima();
        game.baixo();
        game.esquerda();
        game.direita();
    }
} // Fim da classe GameRunner
// public e private são MODIFICADORES DE ACESSO
