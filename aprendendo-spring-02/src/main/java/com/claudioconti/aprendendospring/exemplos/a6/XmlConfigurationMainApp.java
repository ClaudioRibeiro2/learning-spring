package com.claudioconti.aprendendospring.exemplos.a6;

import com.claudioconti.aprendendospring.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigurationMainApp {
    public static void main(String[] args){
        var ctx = new ClassPathXmlApplicationContext("contexConfiguration.xml");
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(ctx.getBean("nome"));
        System.out.println(ctx.getBean("idade"));
        ctx.getBean(GameRunner.class).iniciar();
    } // Fim do método Main
}
