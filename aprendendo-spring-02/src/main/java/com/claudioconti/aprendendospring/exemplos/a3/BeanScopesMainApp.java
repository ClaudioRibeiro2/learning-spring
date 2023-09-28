package com.claudioconti.aprendendospring.exemplos.a3;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Normal {

} // fim da classe normal.
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Prototipo {

}

@ComponentScan // Vasculha por default o pacote que está situado.
public class BeanScopesMainApp {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopesMainApp.class);
        // Singleton - toda vez que você chamar uma Bean, a mesma instância será chamada.
        //           - Só terá uma instância por Spring Container
        System.out.println(ctx.getBean(Normal.class)); // Normal@3c46e67a
        System.out.println(ctx.getBean(Normal.class)); // Normal@3c46e67a
        System.out.println(ctx.getBean(Normal.class)); // Normal@3c46e67a
        // Prototype - toda vez que você chamar uma Bean, sempre será uma instância diferente.
        //           - inúmeras instancia por Spring Container
        System.out.println(ctx.getBean(Prototipo.class)); // Prototipo@c730b35
        System.out.println(ctx.getBean(Prototipo.class)); // Prototipo@206a70ef
        System.out.println(ctx.getBean(Prototipo.class)); // Prototipo@292b08d6
    } // Fim do método Main
}
