package com.claudioconti.spring.aprendendojpahibernate.livro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "Book")
public class Livro {
    // Atributos
    @Id
    @Column(name = "id_book")
    private long id;
    private String nome;
    private String autor;
    // Construtor
    public Livro (){}
    public Livro(long id, String nome, String autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }
    // Getter's
    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getAutor() {
        return autor;
    }
    // Setter's
    public void setId(long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    // toString()
    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
