package com.claudioconti.spring.aprendendospringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dinheiro-service")
public class DinheiroServiceConfiguration {
    // Atributos
    private String url;
    private String nome_usuario;
    private String chave;
    // Getter's & Setter's
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getChave() {
        return chave;
    }
    public void setChave(String chave) {
        this.chave = chave;
    }
} // Fim da classe DinheiroServiceConfiguration
