/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TodoAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    String title;
    String description;
    Date completed;
    
}
