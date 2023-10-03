package com.claudioconti.spring.aprendendojpahibernate.livro.jbdc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LivroJbdcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private LivroJbdcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert();
    }
}
