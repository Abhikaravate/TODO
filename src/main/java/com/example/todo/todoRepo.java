package com.example.todo;
import com.example.todo.todoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface todoRepo extends JpaRepository<todoModel , Long > {

}
