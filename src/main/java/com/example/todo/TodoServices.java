package com.example.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServices {

	@Autowired
	
	private todoRepo torepo ; // its an object of repo class

	
	//Create 
	public todoModel saveTodo ( todoModel todo) {
		return torepo.save(todo) ;
	}
	
	
	// READ all
    public List<todoModel> getAllTodos() {
        return torepo.findAll();
    }
    
    
	//Read by id
	  public todoModel getTodoById(Long id) {
	        Optional<todoModel> todoOpt = torepo.findById(id);
	        return todoOpt.orElse(null);
	    }
	  
	  
	// UPDATE existing todo
	    public todoModel updateTodo(Long id, todoModel updatedTodo) {
	        Optional<todoModel> existingOpt = torepo.findById(id);
	        if (existingOpt.isPresent()) {
	            todoModel todo = existingOpt.get();
	            todo.setWork(updatedTodo.getWork());
	           
	            return torepo.save(todo);
	        }
	        return null;
	    }

	    // DELETE by id
	    public void deleteTodo(Long id) {
	    	torepo.deleteById(id);
	    }
	
}
