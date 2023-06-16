/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TodoAPI.controller;
import com.TodoAPI.exception.TodoNotFoundException;
import com.TodoAPI.model.Todo;
import com.TodoAPI.repository.TodoRepository;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author user
 */
@RestController
public class TodoController {  
      @Autowired
      TodoRepository service;
    
      //Add a Todo
    @PostMapping("/v1/add-todo")
    public ResponseEntity<Object> addTodo(@RequestBody Todo todo){
      Todo variable =  service.save(todo);
      URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(variable.getId()).toUri();
      return ResponseEntity.created(location).build();
    }
    
    
    //Retrieve all Todo
    @GetMapping("/v1/todos")
    public ResponseEntity<Todo> retrieveAllTodo(){
        List<Todo> todo = new ArrayList<>();
        service.findAll().forEach(e->todo.add(e));
       if(todo.isEmpty()){
           return new ResponseEntity(todo, HttpStatus.NO_CONTENT);
       }
       return new ResponseEntity(todo, HttpStatus.OK);
        
      
    }
    
   
    //Retrieve a Todo by id
    @GetMapping(value="/v1/todos/{id}")
    public ResponseEntity<Todo> retrieveaTodo(@PathVariable("id") Long id) {
        Optional<Todo> todo =  service.findById(id);
        todo.orElseThrow(()-> new TodoNotFoundException("No found Todo with id = " +id));
        return new ResponseEntity(todo,HttpStatus.OK);
       
        
     
     
        
    }
  
    //Update a Todo by id
    @PutMapping("/v1/update-todos/{id}")
    public ResponseEntity<Todo> updateaTodo(@PathVariable("id") long id, @RequestBody Todo todo){
     Optional<Todo> todo_ =  service.findById(id);
     todo_.orElseThrow(()-> new TodoNotFoundException("No found Todo with id = " +id));
     todo_.get().setId(todo_.get().getId());
     todo_.get().setTitle(todo_.get().getTitle());
     todo_.get().setDescription(todo_.get().getDescription());
     todo_.get().setCompleted(todo_.get().getCompleted());
     return new ResponseEntity<>(service.save(todo),HttpStatus.OK);
    }
     
    
    //Delete a Todo by id
    @DeleteMapping("/v1/delete-todos/{id}")
    public ResponseEntity<HttpStatus> deleteaTodo(@PathVariable("id") Long id){
            service.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   
     
     
    }
  
}
