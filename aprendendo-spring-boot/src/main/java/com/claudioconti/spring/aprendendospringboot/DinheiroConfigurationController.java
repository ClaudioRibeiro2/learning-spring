package com.claudioconti.spring.aprendendospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DinheiroConfigurationController {

    @Autowired
    private DinheiroServiceConfiguration configuration;

    @RequestMapping("/dinheiro-configuration")
    public DinheiroServiceConfiguration retornarTodosLivros (){
        return configuration;
    } // Fim do método retornarTodosLivros

} // Fim da classe LivroController
