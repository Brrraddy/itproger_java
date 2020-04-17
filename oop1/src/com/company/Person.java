package com.company;

public class Person {
    public int height = 180;
    public String name = "Default";

    public void say (String name){
        System.out.println("Hello, " + name);
    }

    public Person  (){

    }

    public Person  (String n){
       name = n;
    }


}
