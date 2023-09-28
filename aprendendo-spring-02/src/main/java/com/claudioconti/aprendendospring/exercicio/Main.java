package com.claudioconti.aprendendospring.exercicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class Main {
    public static void main (String[] args){
        System.out.println("Tentando inicializar o Spring container...");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        System.out.println("Spring container inicializado!");
        // Testando se o Spring Container esta funcionando, listando todos os Beans
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        ctx.getBean(CalculoNegocios.class).acharMax();
    } // Método Main
} // Fim da classe Main
