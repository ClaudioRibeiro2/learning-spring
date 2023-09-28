package com.claudioconti.aprendendospring.exemplos.a4;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class JohnDoe {
    // Atributos
    private Dependencia instDependencia;

    // Construtor
    public JohnDoe (Dependencia dependencia) {
        super();
        this.instDependencia = dependencia;
        System.out.println("Construído!");
    }
    // Métodos
    @PostConstruct // Define que só invocado este método depois que o construtor for usado e AutoWired.
    public void iniciar(){
        instDependencia.ficarPronto();
    }
    @PreDestroy // Define que só será invocado antes do término de um spring container.
    public void limpeza(){
        System.out.println("Limpo!");
    }
} // Fim da classe JohnDoe
@Component
class Dependencia {

    // Métodos
    public void ficarPronto() {
        System.out.println("Usando alguma lógica de negócios e utilizando alguma dependencia.");
    }
} // Fim da classe Dependencia.

@ComponentScan // Vasculha por default o pacote que está situado.
public class PrePostMainApp {
    public static void main(String[] args){
        try (var ctx = new AnnotationConfigApplicationContext(PrePostMainApp.class)){
            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        }
    } // Fim do método Main
}
