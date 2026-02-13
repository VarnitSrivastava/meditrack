package com.airtribe.meditrack.exception;


public class invalidDataException extends RuntimeException{

    public invalidDataException()
    {
        super("Invalid data provide");

    }
    public invalidDataException(String message){
        super (message);
    }
    public invalidDataException(String message, Throwable cause){
        super(message, cause);
    }
}

