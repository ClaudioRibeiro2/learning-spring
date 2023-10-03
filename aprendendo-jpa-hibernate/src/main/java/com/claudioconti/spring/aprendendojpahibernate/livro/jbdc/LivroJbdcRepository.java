package com.claudioconti.spring.aprendendojpahibernate.livro.jbdc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// Uma classe que fala com um banco de dados.
@Repository
public class LivroJbdcRepository {
    // Atributos
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY =
            """
                insert into livro(id, nome, autor)
                values(1,'Crime e Castigo','Fiódor Dostoiévski');
            """;

    public void insert() {
        jdbcTemplate.update(INSERT_QUERY);
    }
} // Fim da classe LivroJbdcRepository
