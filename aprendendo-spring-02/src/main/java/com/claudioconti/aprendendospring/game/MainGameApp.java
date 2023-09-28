package com.claudioconti.aprendendospring.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

// @Configuration é para deixar o Spring saber que aqui, é onde vão ser declarados os @Beans,
// @ComponentScan, escaneia o pacote (package) escolhido em busca de @Components
// @Component cria uma instância de uma classe automaticamente para ser gerenciada no Spring Container
@Configuration
@ComponentScan("com.claudioconti.aprendendospring.game")
public class MainGameApp {
    public static void main(String[] args){
        // Instancia uma aplicação Spring Container.
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainGameApp.class);
        // getBean() pega o objeto instanciado no Spring Container
        ctx.getBean(GameRunner.class).iniciar();
        // Imprime todos os Beans que foram instanciados pelo Spring Container
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    } // Fim do método main
}
