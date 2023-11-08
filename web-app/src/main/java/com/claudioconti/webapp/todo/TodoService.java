package com.claudioconti.webapp.todo;


import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    // Atributos
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
        todos.add(new Todo(++todosCount, "Claudin", "Fazer Árvore B",
                            LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "Claudin", "Ler Kumoko",
                LocalDate.now().plusMonths(6), false));
        todos.add(new Todo(++todosCount, "Claudin", "Ler BookWorm",
                LocalDate.now().plusMonths(7).plusWeeks(3), false));
    }
    // Métodos
    public List<Todo> acharPorUsuario(String usuario){
        return todos;
    }
    public void criarTarefa (String usuario, String descricao, LocalDate dataFinal, boolean feito){
        Todo tarefa = new Todo(++todosCount, usuario, descricao, dataFinal, feito);
        todos.add(tarefa);
    }

    public void apagarPorId(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo acharPorId(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo tarefa = todos.stream().filter(predicate).findFirst().get();
        return tarefa;
    }

    public void atualizarTarefa(@Valid Todo tarefa) {
        apagarPorId(tarefa.getId());
        todos.add(tarefa);
    }
}
