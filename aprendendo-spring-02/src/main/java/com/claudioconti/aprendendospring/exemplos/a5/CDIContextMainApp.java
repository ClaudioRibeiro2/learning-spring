package com.claudioconti.aprendendospring.exemplos.a5;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class NegociosServico {
    // Atributos
    private DataServico instDataServico;
    // Getter & Setter
    public DataServico getDataServico() {
        System.out.print("getDataServico() = ");
        return instDataServico;
    }
    //@Autowired
    @Inject
    public void setDataServico(DataServico a) {
        this.instDataServico = a;
    }
} // fim da classe NegociosServico

@Component
class DataServico {

} // fim da classe DataServico

@ComponentScan // Vasculha por default o pacote que está situado.
public class CDIContextMainApp {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CDIContextMainApp.class);
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(ctx.getBean(NegociosServico.class).getDataServico());
    } // Fim do método Main
}
