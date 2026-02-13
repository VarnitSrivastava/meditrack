package com.airtribe.meditrack.entity;

public class person extends medicalentity{
 private String name;
 private int age;

 public person (String id, String name, int age){
     this.id = id;
     this.name = name;
     this.age = age;

 }

 public String getName() {return name;}
 public int getAge () { return age;}

    @Override

    public void display () {
     System.out.println(name + "("+age+")");
    }
}
