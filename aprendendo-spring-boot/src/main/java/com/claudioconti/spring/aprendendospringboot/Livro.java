package com.claudioconti.spring.aprendendospringboot;

public class Livro {
    // Atributos
    private long id;
    private String nome;
    private String autor;
    // Construtor
    public Livro(long id, String nome, String autor) {
        super();
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }
    // Getter's
    public long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAutor() {
        return this.autor;
    }
    // Métodos

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
