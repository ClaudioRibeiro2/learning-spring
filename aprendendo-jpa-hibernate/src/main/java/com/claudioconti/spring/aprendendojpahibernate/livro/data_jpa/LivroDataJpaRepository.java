package com.claudioconti.spring.aprendendojpahibernate.livro.data_jpa;

import com.claudioconti.spring.aprendendojpahibernate.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroDataJpaRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByAutor(String autor);
    List<Livro> findByNome(String nome);
}
