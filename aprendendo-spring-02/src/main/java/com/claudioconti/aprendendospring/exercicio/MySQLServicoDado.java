package com.claudioconti.aprendendospring.exercicio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("MySQL")
public class MySQLServicoDado implements ServicoDado {
    @Override
    public int[] recuperarDados() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
