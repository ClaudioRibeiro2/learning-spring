package com.claudioconti.aprendendospring;

import com.claudioconti.aprendendospring.game.GameConsole;
import com.claudioconti.aprendendospring.game.GameRunner;
import com.claudioconti.aprendendospring.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Anotação @Configuration é para deixar o Sping saber que aqui, é onde você vai declarar os Beans,
@Configuration
public class GameConfiguration {

    // É uma anotação usado para indicar um método que instancia, configura e inicializa um novo objeto
    @Bean
    public GameConsole jogo(){
        PacMan jogo = new PacMan();
        return jogo;
    }  // Fim do bean game()
    // Criando um novo jogo PacMan e "wiring it" em gameRunner, que inicializa o jogo e invoca os métodos;
    @Bean
    public GameRunner gameRunner (GameConsole jogo){
        GameRunner gameRunner = new GameRunner(jogo);
        return gameRunner;
    } // Fim do bean gameRunner()
} // Fim da classe GameConfiguration
