package com.github.alvescee.washere.ExceptionHandler;

import java.io.Serializable;
import java.util.Calendar;

import org.springframework.http.HttpStatus;

public class ExceptionModel implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Calendar timeStamp = Calendar.getInstance();
    private String message;
    private HttpStatus status;
    private String path;

    // Construtor
    
    public ExceptionModel(String message, HttpStatus status, String path) {
        this.message = message;
        this.status = status;
        this.path = path;
    }

    // Getter

    public Calendar getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getPath() {
        return path;
    }

    // Setter

    public void setTimeStamp(Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public void setPath(String path) {
        this.path = path;
    }

}