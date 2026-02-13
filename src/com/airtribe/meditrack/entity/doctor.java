package com.airtribe.meditrack.entity;

import com.airtribe.meditrack.enums.Specialization;

public class doctor extends person{
    private Specialization specialization;
    private double fee;

    public doctor(String id, String name, int age, Specialization specialization, double fee){
        super (id, name, age);
        this.specialization = specialization;
        this.fee = fee;
    }
public double getFee() {
        return fee;
   }


    public boolean getspecialization() {
           return getspecialization();
    }

    public boolean getid() {
        if (getid()) return true;
        else return false;
    }
}
