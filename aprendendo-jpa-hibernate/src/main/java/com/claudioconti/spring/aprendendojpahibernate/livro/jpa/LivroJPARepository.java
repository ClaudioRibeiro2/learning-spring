package com.claudioconti.spring.aprendendojpahibernate.livro.jpa;

import com.claudioconti.spring.aprendendojpahibernate.livro.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

// É uma anotação que conversa com um Banco de Dados.
@Repository
@Transactional
public class LivroJPARepository {
    // Atributos
    @PersistenceContext
    private EntityManager entityManager;
    // Métodos
    public void insert(Livro livro){
        entityManager.merge(livro);
    }
    public Livro findById(long id){
        return entityManager.find(Livro.class, id);
    }
    public void deleteById(long id){
        Livro livro = entityManager.find(Livro.class, id);
        entityManager.remove(livro);
    }
}
