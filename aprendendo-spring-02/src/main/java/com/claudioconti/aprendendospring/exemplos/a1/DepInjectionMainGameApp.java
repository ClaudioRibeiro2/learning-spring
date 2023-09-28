package com.claudioconti.aprendendospring.exemplos.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// @Component cria uma instância para você automaticamente no Spring Container
@Component
class Empresa {
    Depedencia1 depedencia1;
    Depedencia2 depedencia2;

    @Autowired
    public Empresa(Depedencia1 a, Depedencia2 b) {
        System.out.println("Construtor Injection");
        this.depedencia1 = a;
        this.depedencia2 = b;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "depedencia1=" + depedencia1 +
                ", depedencia2=" + depedencia2 +
                '}';
    }
} // Fim da classe Empresa

@Component
class Depedencia1 {

} // Fim da classe Depedencia1

@Component
class Depedencia2 {

} // Fim da classe Depedencia2

@Configuration // Declara que esta classe é a 'main'
@ComponentScan // Vasculha por default o pacote que está situado.
public class DepInjectionMainGameApp {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DepInjectionMainGameApp.class);
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        //                                          forEach(x -> System.out.println(x));
        System.out.println(ctx.getBean(Empresa.class));
    } // Fim do método Main
}
