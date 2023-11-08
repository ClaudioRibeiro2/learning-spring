package com.claudioconti.webapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("nome")
public class TodoController {
    // Atributos
    private TodoService todoService;
    // Construtor
    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }
    // Métodos
    @RequestMapping("list-todos")
    public String listarTodos(ModelMap model){
        List<Todo> tarefas = todoService.acharPorUsuario("Claudin");
        model.addAttribute("tarefas", tarefas);
        return "listTodos";
    }

    // Mostra a pagina tarefa.jsp, só maneja respostas Get
    @RequestMapping(value = "criar-tarefa", method = RequestMethod.GET)
    public String mostrarPaginaCriarTarefa(ModelMap model){
        String usuario = (String) model.get("name");
        Todo tarefa = new Todo(0, usuario, "", LocalDate.now(), false);
        model.put("todo", tarefa);
        return "tarefa";
    }
    // Armazena nova tarefa que foi recebida na página tarefa.jsp, só maneja respostas Post
    @RequestMapping(value = "criar-tarefa", method = RequestMethod.POST)
    public String criarNovaTarefa(ModelMap model, @Valid Todo tarefa, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "tarefa";
        }
        String usuario = (String) model.get("name");
        todoService.criarTarefa(usuario, tarefa.getDescricao(),
                                LocalDate.now().plusYears(1), false );
        return "redirect:list-todos";
    }

    @RequestMapping("apagar-tarefa")
    public String apagarTarefa(@RequestParam int id){
        todoService.apagarPorId(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value = "atualizar-tarefa", method = RequestMethod.GET)
    public String mostrarPaginaAtualizarTarefa(@RequestParam int id, ModelMap model){
        Todo tarefa= todoService.acharPorId(id);
        model.addAttribute("todo", tarefa);
        return "tarefa";
    }

    @RequestMapping(value = "atualizar-tarefa", method = RequestMethod.POST)
    public String atualizarTarefa(ModelMap model, @Valid Todo tarefa, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "tarefa";
        }
        String usuario = (String) model.get("name");
        tarefa.setUsuario(usuario);
        todoService.atualizarTarefa(tarefa);
        return "redirect:list-todos";
    }
} // Fim da classe TodoController
