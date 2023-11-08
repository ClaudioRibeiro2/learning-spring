package com.claudioconti.webapp.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {
    // Atributos
    private int id;
    private String usuario;
    @Size(min = 10, message = "Por favor, adiciona pelo menos 10 caracteres.")
    private String descricao;
    private LocalDate dataFinal;
    private boolean feito;
    // Construtor
    public Todo(int id, String usuario, String descricao, LocalDate dataFinal, boolean feito) {
        super();
        setId(id);
        setUsuario(usuario);
        setDescricao(descricao);
        setDataFinal(dataFinal);
        setFeito(feito);
    }
    // Métodos

    // Getter's & Setter's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public boolean isFeito() {
        return feito;
    }

    public void setFeito(boolean feito) {
        this.feito = feito;
    }
    // toString
    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataFinal=" + dataFinal +
                ", feito=" + feito +
                '}';
    }
} // Fim da classe Todo
