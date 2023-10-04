package com.claudioconti.spring.aprendendojpahibernate.livro;

import com.claudioconti.spring.aprendendojpahibernate.livro.data_jpa.LivroDataJpaRepository;
import com.claudioconti.spring.aprendendojpahibernate.livro.jpa.LivroJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LivroCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private LivroJbdcRepository repository;
//    @Autowired
//    private LivroJPARepository repository;

    @Autowired
    private LivroDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Livro(1,"Crime e Castigo","Fiódor Dostoiévski"));
        repository.save(new Livro(2,"Tribulation of Myriad Races","Eagle Eats Chicken (老鹰吃小鸡)"));
        repository.save(new Livro(3,"Damn Reincarnation","Mok Ma (목마)"));
        repository.save(new Livro(4,"Shadow Slave","Guiltythree"));

        repository.deleteById(2L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.findByAutor(""));
        System.out.println(repository.findByAutor("Guiltythree"));
        System.out.println(repository.findByNome(""));
        System.out.println(repository.findByNome("Damn Reincarnation"));
    }
}
