package com.claudioconti.aprendendospring;

import com.claudioconti.aprendendospring.game.GameConsole;
import com.claudioconti.aprendendospring.game.GameRunner;
import com.claudioconti.aprendendospring.game.PacMan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicativoGames2 {
    public static void main(String[] args){

        // Instancia um Spring Container, aqui ele instanciou GameConfiguration, que tem um Bean
        // jogo() que instanciou um novo objeto da classe PacMan
        ApplicationContext ctx = new AnnotationConfigApplicationContext(GameConfiguration.class);

        // getBean() pega o objeto instanciado no Spring Container
        ctx.getBean(GameConsole.class).cima();
        ctx.getBean(GameRunner.class).iniciar();


    } // MÉTODO MAIN
}
