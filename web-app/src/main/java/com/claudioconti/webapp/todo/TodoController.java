package com.claudioconti.webapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
        List<Todo> todos = todoService.findByUsuario("Claudin");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
} // Fim da classe TodoController
