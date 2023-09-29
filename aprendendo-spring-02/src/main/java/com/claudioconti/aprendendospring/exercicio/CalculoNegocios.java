package com.claudioconti.aprendendospring.exercicio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

// É quando você define que está classe vai ser um Spring Bean e vai ser gerenciada pelo Spring container
//@Component
@Service
public class CalculoNegocios {
    // Atributos
    private ServicoDado dado;
    // Construtor
    public CalculoNegocios(@Qualifier("MySQL") ServicoDado a) {
        super();
        this.dado = a;
    }
    // Métodos
    public int acharMax(){
        int calc = Arrays.stream(dado.recuperarDados()).max().orElse(0);
        System.out.println(dado);
        System.out.println(calc);
        return calc;
    }
}
