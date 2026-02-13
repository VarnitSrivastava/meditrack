package com.airtribe.meditrack.exception;

public class Appointementnotfoundexception extends RuntimeException {
    public Appointementnotfoundexception(){
        super ("Appointment not found");
    }
    public Appointementnotfoundexception(String message){
        super (message);
    }
    public Appointementnotfoundexception(String message,Throwable cause){
        super(message, cause);
    }
}
