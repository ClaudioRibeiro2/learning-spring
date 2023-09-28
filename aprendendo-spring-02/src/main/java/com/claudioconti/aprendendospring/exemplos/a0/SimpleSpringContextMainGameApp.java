package com.claudioconti.aprendendospring.exemplos.a0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@ComponentScan // Vasculha por default o pacote que está situado.
public class SimpleSpringContextMainGameApp {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleSpringContextMainGameApp.class);
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    } // Fim do método Main
}
