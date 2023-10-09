package com.claudioconti.webapp.comprimento;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Classe que controla Web Requests
public class SaudacaoController {
    // Atributos - final só pode ser atribuído uma vez.
    private final String saudacao = "Olá seja muito bem-vindo a minha humilde Aplicação.";
    // Métodos
    @RequestMapping("saudar") // Mapeia este url para que toda vez que for invocado, será retornado este método.
    @ResponseBody // Esta anotação transforma um método java, em um retorno adequado para ir para a web, como um JSON ou XML.
    public String saudar(){
        return saudacao;
    }
    @RequestMapping("gritar")
    @ResponseBody
    public String gritar(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> Grito </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>I've become so numb, I can't feel you there</h1>");
        sb.append("<h1>Become so tired, so much more aware</h1>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
    @RequestMapping("sussurro")
    public String sussurrar(){
        return "sussurro";
    }
} // Fim da classe SaudacaoController