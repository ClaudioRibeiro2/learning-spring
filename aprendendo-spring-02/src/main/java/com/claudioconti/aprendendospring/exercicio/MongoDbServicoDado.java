package com.claudioconti.aprendendospring.exercicio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MongoDB")
public class MongoDbServicoDado implements ServicoDado{
    @Override
    public int[] recuperarDados(){
        return new int[] {11, 22, 33, 44, 55};
    }
}
