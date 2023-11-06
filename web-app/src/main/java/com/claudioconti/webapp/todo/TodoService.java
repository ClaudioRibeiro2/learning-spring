package com.claudioconti.webapp.todo;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    // Atributos
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "Claudin", "Fazer Árvore B",
                            LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Claudin", "Ler Kumoko",
                LocalDate.now().plusMonths(6), false));
        todos.add(new Todo(3, "Claudin", "Ler BookWorm",
                LocalDate.now().plusMonths(7).plusWeeks(3), false));
    }
    // Métodos
    public List<Todo> findByUsuario (String usuario){
        return todos;
    }
}
