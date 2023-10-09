package com.claudioconti.webapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class LoginController {
    // Atributos
    private Logger registrador = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String loginPage(@RequestParam String nome, ModelMap modelo){
        modelo.put("nome", nome);
        //registrador.debug("Request param é {}, vai ser imprimido em DEBUG level.", nome);
        return "login";
    }
} // Fim da classe LoginController
