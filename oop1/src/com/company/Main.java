package com.company;

public class Main {

    public static void main(String[] args) {
	    Person vitya = new Person(120,"Vitya");
	    vitya.height = 120;
	    vitya.say("George");
        System.out.println(vitya.name + "\'s height: " + vitya.height);

        Person vlad = new Person();
        System.out.println(vlad.height);

        Person dima = new Person("Dima");
        System.out.println(dima.name);
        System.out.println("");

        Student freshman = new Student(76, "Viktor", 1);
        freshman.tell();

        Student fresh = new Student(176, "Vlad", 3);
        fresh.tell();
    }
}
