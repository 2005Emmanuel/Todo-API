/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TodoAPI.controller;
import com.TodoAPI.exception.TodoNotFoundException;
import com.TodoAPI.model.Todo;
import com.TodoAPI.repository.TodoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


/**
 *
 * @author user
 */
@RestController
@RequestMapping("todos")
public class TodoController {  
      @Autowired
      TodoRepository service;
    
  
      //Add a Todo
      //swagger config
      @Operation(summary="Add a todo")
       @ApiResponses(value={
        @ApiResponse(responseCode="201", description="Succesfully added a todo",
                content = @Content),
                })
    @PostMapping("/v1/add-todo")
    public ResponseEntity<Object> addTodo(@RequestBody Todo todo){
      Todo variable =  service.save(todo);
      URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(variable.getId()).toUri();
      return ResponseEntity.created(location).build();
    }
    
    
    //Retrieve all Todo
    //Swagger config
          @Operation(summary="Retrieve all todo")
       @ApiResponses(value={
        @ApiResponse(responseCode="200", description="Succesfully retrieved all todos",
                content = { @Content(mediaType =
                        "application/json", schema = @Schema(implementation = Todo.class )) }),
                  @ApiResponse(responseCode="204", description="No Todo Found",
                        content = @Content),
                })
    @GetMapping("/v1/todos")
    public ResponseEntity<Todo> retrieveAllTodo(){
        List<Todo> todo = new ArrayList<>();
        service
                .findAll().forEach(e->todo.add(e));
       if(todo.isEmpty()){
           return new ResponseEntity(todo, HttpStatus.NO_CONTENT);
       }
       return new ResponseEntity(todo, HttpStatus.OK);
        
      
    }
    
   
    //Retrieve a Todo by id
    //Swagger config
       @Operation(summary="Retrieve a todo")
       @ApiResponses(value={
        @ApiResponse(responseCode="200", description="Succesfully retrieved a todo",
                content = { @Content(mediaType =
                        "application/json", schema = @Schema(implementation = Todo.class )) }),
                @ApiResponse(responseCode="404", description="Todo Not Found",
                        content =  @Content),
                @ApiResponse(responseCode="500", description="Server Error",
                        content = @Content)
                })
    @GetMapping(value="/v1/todos/{id}")
    public ResponseEntity<Todo> retrieveaTodo(@PathVariable("id") Long id) {
        Optional<Todo> todo =  service.findById(id);
        todo
                .orElseThrow(()-> new TodoNotFoundException("No Todo Found with id = " +id));
        return new ResponseEntity(todo,HttpStatus.OK);    
    }
  
    //Update a Todo by id
    //Swagger config
        @Operation(summary="Update a todo")
        @ApiResponses(value={
        @ApiResponse(responseCode="200", description="Succesfully Updated a todo",
                content = @Content),
                @ApiResponse(responseCode="404", description="Todo Not Found",
                        content =  @Content),
                @ApiResponse(responseCode="500", description="Server Error",
                        content = @Content)
                })
    @PutMapping("/v1/update-todos/{id}")
    public ResponseEntity<Todo> updateaTodo(@PathVariable("id") long id, @RequestBody Todo todo){
     Optional<Todo> todo_ =  service.findById(id);
     todo_
             .orElseThrow(()-> new TodoNotFoundException("No Todo Found with id = " +id));
     todo_.get().setId(todo_.get().getId());
     todo_.get().setTitle(todo_.get().getTitle());
     todo_.get().setDescription(todo_.get().getDescription());
     todo_.get().setCompleted(todo_.get().getCompleted());
     return new ResponseEntity<>(service.save(todo),HttpStatus.OK);
    }
     
    
    //Delete a Todo by id
    //Swaggerconfig
       @Operation(summary="Delete a todo")
       @ApiResponses(value={
        @ApiResponse(responseCode="200", description="Succesfully deleted a todo",
                content = @Content),
                @ApiResponse(responseCode="404", description="Todo Not Found",
                        content =  @Content),
                @ApiResponse(responseCode="500", description="Server Error",
                        content = @Content)
                })
    @DeleteMapping("/v1/delete-todos/{id}")
    public ResponseEntity<Todo> deleteaTodo(@PathVariable("id") Long id){
           Optional <Todo> todo = service.findById(id);
           service.deleteById(id);
           todo
                   .orElseThrow(()->new TodoNotFoundException("No found Todo with id "+id+" to delete"));
           return new ResponseEntity<>(HttpStatus.OK);
           
   
     
     
    }
  
}
