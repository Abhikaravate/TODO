package com.example.todo;
import com.example.todo.todoModel;
import com.example.todo.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/todo")


public class TodoController {
	
	@Autowired
	private  TodoServices todoService;
	
	// CREATE a new todo
    @PostMapping
    public todoModel createTodo(@RequestBody todoModel todo) {
        return todoService.saveTodo(todo);
    }

    // READ all todos
    @GetMapping
    public List<todoModel> getAllTodos() {
        return todoService.getAllTodos();
    }

    // READ a todo by ID
    @GetMapping("/{id}")
    public todoModel getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    // UPDATE an existing todo
    @PutMapping("/{id}")
    public todoModel updateTodo(@PathVariable Long id, @RequestBody todoModel todo) {
        return todoService.updateTodo(id, todo);
    }

    // DELETE a todo by ID
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
	
	

}
