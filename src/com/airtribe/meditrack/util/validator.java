package com.airtribe.meditrack.util;

import com.airtribe.meditrack.exception.invalidDataException;

public class validator {
    public static void validateAge(int age){
        if (age <= 0){
            throw new invalidDataException("Age must be greater than 0");
        }
    }
    public static void validateName(String name){
       if (name == null || name.trim().isEmpty()){
           throw new invalidDataException("Name cannot be empty");
       }
    }
}
