/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TodoAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author user
 */
@Entity
@Data
public class Todo {
    @Id
    Long id;
    String title;
    String description;
    Date completed;
    
}
