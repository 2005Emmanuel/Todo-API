/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.TodoAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author user
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class TodoNotFoundException extends RuntimeException {

    /**
     * Creates a new instance of <code>TodoNotFoundException</code> without
     * detail message.
     */
    public TodoNotFoundException() {
    }

    /**
     * Constructs an instance of <code>TodoNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TodoNotFoundException(String msg) {
        super(msg);
    }
}
