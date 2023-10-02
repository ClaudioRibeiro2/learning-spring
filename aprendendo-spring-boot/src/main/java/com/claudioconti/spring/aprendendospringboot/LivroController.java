package com.claudioconti.spring.aprendendospringboot;

// Quando entrar em http://localhost/livro
// Receber dados de livro: id, nome, autor

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LivroController {

    @RequestMapping("/livros")
    public List<Livro> retornarTodosLivros (){
        return Arrays.asList(
                new Livro(1,"Crime e Castigo","Fiódor Dostoiévski"),
                new Livro(2, "Damn Reincarnation","Mok Ma (목마)"),
                new Livro(3, "Shadow Slave","Guiltythree")
        );
    } // Fim do método retornarTodosLivros

} // Fim da classe LivroController
