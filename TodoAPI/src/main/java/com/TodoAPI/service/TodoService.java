/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TodoAPI.service;

import com.TodoAPI.model.Todo;
import com.TodoAPI.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class TodoService {
    @Autowired
    TodoRepository Todorepository;
    
    //get all Todo
    public List<Todo> getall(){
        List<Todo> list = new ArrayList<>();
        Todorepository.findAll().forEach(e->list.add(e));
        return list;
    }
    
    
    //get a specific todo
    public Todo getaTodo(Long id){
     Optional<Todo> todo = Todorepository.findById(id);
     Todo todo_ = todo.get();
     return todo_;
    }
    
    //add a Toodo
    public Todo AddTodo(Todo todo){
     return Todorepository.save(todo);
    }
    
    
    //delete a specific Todo
    public void deleteaTodo(Long id){
        Todorepository.deleteById(id);
    }
    
    //update a specific Todo
    public Todo updateaTodo(int id, Todo todo){
       return Todorepository.save(todo);
    }
    
}
