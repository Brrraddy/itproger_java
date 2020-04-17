package com.company;

public class Main {

    public static void main(String[] args) {
	    Array a = new MyArray();
        System.out.println(a.Add(3));
        System.out.println(a.Add(32));
        System.out.println(a.Add(34));
        System.out.println(a.Add(7));
        System.out.println(a.Add(5));
        System.out.println(a.Get(8));

        Array b = new OtherArray();
        System.out.println(b.Add(3));
        System.out.println(b.Add(32));
        System.out.println(b.Add(34));
        System.out.println(b.Add(7));
        System.out.println(b.Add(5));
        System.out.println(b.Get(8));
    }
}
