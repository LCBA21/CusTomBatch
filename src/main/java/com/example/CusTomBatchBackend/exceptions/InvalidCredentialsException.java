package com.example.CusTomBatchBackend.exceptions;

public class InvalidCredentialsException extends RuntimeException{

    public InvalidCredentialsException(String message){
        super(message);
    }
}
