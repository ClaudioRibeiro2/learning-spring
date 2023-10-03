package com.claudioconti.aprendendospring.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Pessoa (String nome, int idade, Endereco endereco) {}
record Endereco (String cidade, String pais) {}

@Configuration // Aqui dentro conseguimos definir Spring Beans
public class HelloWorldConfiguration {

    @Bean
    public String nome(){
        return "Sienna Merdein";
    }

    @Bean
    public Integer idade(){
        return 315;
    }

    @Bean
    @Primary
    public Pessoa pessoa () {
        Pessoa pessoa = new Pessoa("Hamel Dynas", 30, new Endereco("Rio de Janeiro", "Brasil"));
        return pessoa;
    }

    @Bean
    public Pessoa pessoa2 () {
        Pessoa pessoa = new Pessoa(nome(), idade(), endereco());
        return pessoa;
    }

    @Bean
    public Pessoa pessoa3 (String nome, int idade, @Qualifier("endereco2") Endereco endereco) {
        Pessoa pessoa = new Pessoa(nome, idade, endereco);
        return pessoa;
    }

    @Bean(name = "endereco_pessoa")
    @Primary
    public Endereco endereco () {
        Endereco endereco = new Endereco("Florianópolis", "Brasil");
        return endereco;
    }

    @Bean(name = "endereco_pessoa2")
    @Qualifier("endereco2")
    public Endereco endereco2 () {
        Endereco endereco = new Endereco("São paulo", "Brasil");
        return endereco;
    }
} // Fim da classe HelloWorldConfiguration
