/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TodoAPI.repository;

import com.TodoAPI.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
