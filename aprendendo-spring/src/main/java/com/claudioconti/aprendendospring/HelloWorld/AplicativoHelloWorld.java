package com.claudioconti.aprendendospring.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicativoHelloWorld {
    public static void main(String[] args){
        // 1: Lançar o Spring Contex.
        try(var contex =
                    new AnnotationConfigApplicationContext
                            (HelloWorldConfiguration.class)) {
            // 2: Configurar as coisas que queremos que o Spring maneje.
            // HelloWorldConfiguration - @Configuration
            // nome - @Bean

            // Pegando os Beans manejados pelo Spring
            //System.out.println(contex.getBean("pessoa"));

            //System.out.println(contex.getBean("pessoa2"));

            System.out.println(contex.getBean("pessoa3"));

            System.out.println(contex.getBean("endereco_pessoa2"));

            System.out.println(contex.getBean(Endereco.class)); // Outro jeito de pegar o método

            System.out.println(contex.getBean(Pessoa.class)); // Outro jeito de pegar o método
            //Arrays.stream(contex.getBeanDefinitionNames()).forEach(System.out::println);
        }
    } // MÉTODO MAIN
}
