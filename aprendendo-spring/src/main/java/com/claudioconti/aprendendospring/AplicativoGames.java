package com.claudioconti.aprendendospring;

import com.claudioconti.aprendendospring.game.GameRunner;
import com.claudioconti.aprendendospring.game.PacMan;
import com.claudioconti.aprendendospring.game.Super;

public class AplicativoGames {
    public static void main(String[] args){

        //Mario game = new Mario();
        //Super game = new Super();
        PacMan game = new PacMan(); // Criação de um objeto.
        //Coloquei o PacMan game como parâmetro no objeto instanciado gameRunner
        GameRunner gameRunner = new GameRunner(game); // Criação de um objetoAplicativoGames
        gameRunner.iniciar();

    } // MÉTODO MAIN
}
