package com.claudioconti.aprendendospring.exemplos.a2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class A {

}
@Component
// Lazy permite que um Bean só seja inicializado quando ele for utilizado. Senão ele sempre será
// inicializado quando o Spring container for iniciado. Não é recomendado usar normalmente.
@Lazy
class B {
    // Atributos
    private A instA;
    // Construtor
    public B (A a){
        System.out.println("Lazy Initialization");
        this.instA = a;
    }
    // Métodos
    public void metod01 (){
        System.out.println("Método metod01 foi chamado.");
    }
}

@Configuration // Declara que esta classe é a 'main'
@ComponentScan // Vasculha por default o pacote que está situado.
public class LazyInitializationApp {
    public static void main(String[] args){
        System.out.println("Tentando inicializar o Spring Container (Contex)...");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LazyInitializationApp.class);
        System.out.println("Spring Container Inicializado!");
        ctx.getBean(B.class).metod01();
    } // Fim do método Main
}
