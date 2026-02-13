package com.airtribe.meditrack.entity;

public class patient extends person implements Cloneable{
    private String disease;

    public patient (String id, String name, int age, String disease){
        super (id, name, age);
        this.disease = disease;
    }
    @Override
    public patient clone() {
        return new patient(this.id, this.getName(),this.getAge(), this.disease);
    }
}
