package com.example.CusTomBatchBackend.exceptions;

public class NameValueRequiredException extends RuntimeException{

    public NameValueRequiredException(String message){
        super(message);
    }
}
