package com.claudioconti.webapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller // Classe que controla os web requests
@SessionAttributes("nome")
public class LoginController {
    // Atributos
    private AutenticacaoService autenticacaoService;
    // Construtor
    public LoginController(AutenticacaoService autenticacaoService) {
        super();
        this.autenticacaoService = autenticacaoService;
    }

    // Métodos
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String nome, @RequestParam String senha, ModelMap model){
        if(autenticacaoService.validar(nome, senha)){
            model.put("nome", nome);
            model.put("senha", senha);

            return "bemvindo";
        }
        return "login";
    }
} // Fim da classe LoginController