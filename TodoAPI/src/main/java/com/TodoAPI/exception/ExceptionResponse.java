/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TodoAPI.exception;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author user
 */
@Data
public class ExceptionResponse {
    int statusCode;
    Date timestamp;
    String message;
    String details;
    
    public ExceptionResponse(int statusCode, Date timestamp, String message, String details){
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
    
}
