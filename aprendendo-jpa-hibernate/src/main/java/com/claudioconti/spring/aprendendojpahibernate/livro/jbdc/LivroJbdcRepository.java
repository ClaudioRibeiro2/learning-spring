package com.claudioconti.spring.aprendendojpahibernate.livro.jbdc;

import com.claudioconti.spring.aprendendojpahibernate.livro.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// Uma classe que fala com um banco de dados.
@Repository
public class LivroJbdcRepository {
    // Atributos
    @Autowired
    private JdbcTemplate jdbcTemplate; // Classe do Spring que consegue dar query em um BD
    // QUERY PARA ADCIONAR UMA LINHA AO BD
    private static String INSERT_QUERY =
            """
                insert into livro(id, nome, autor)
                values(?, ?, ?);
            """;
    // QUERY PARA DELETAR UMA LINHA DO BD
    private static String DELETE_QUERY =
            """
                delete from livro where id = ?;
            """;
    private static String SELECT_QUERY =
            """
                select * from livro
                where id = ?;
            """;
    // Métodos
    public void insert(Livro livro) {
        jdbcTemplate.update(INSERT_QUERY, livro.getId(), livro.getNome(), livro.getAutor());
    }
    public void deleteById(long id){
        jdbcTemplate.update(DELETE_QUERY, id);
    }
    public Livro selectById(long id){
        return jdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Livro.class), id);
    }
} // Fim da classe LivroJbdcRepository
