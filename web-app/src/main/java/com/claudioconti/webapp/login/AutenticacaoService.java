package com.claudioconti.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService {
    // Métodos
    public boolean validar (String usuario, String senha){
        boolean validacaoUsuario = usuario.equalsIgnoreCase("Claudin");
        boolean validacaoSenha = senha.equalsIgnoreCase("456123");

        return validacaoUsuario && validacaoSenha;
    }
} // Fim da classe AutenticacaoService
