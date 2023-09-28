package com.claudioconti.aprendendospring.exercicio;

import com.claudioconti.aprendendospring.game.Super;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CalculoNegocios {
    // Atributos
    private ServicoDado dado;
    // Construtor
    public CalculoNegocios(@Qualifier("MySQL") ServicoDado dado) {
        super();
        this.dado = dado;
    }
    // Métodos
    public int acharMax(){
        int calc = Arrays.stream(dado.recuperarDados()).max().orElse(0);
        System.out.println(dado);
        System.out.println(calc);
        return calc;
    }
}
