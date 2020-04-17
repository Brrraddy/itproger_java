package com.company;

public class OtherArray implements Array {
    int a[] =  new int[50];
    int size = 0;

    @Override
    public int Get (int i){
        if (i < a.length)
            return a[a.length - i -1];
        else
            return a[0];
    }

    @Override
    public boolean Add (int value){
        if (size != a.length){
            a[size] = value;
            size++;
            return true;
        }else
            return false;
    }

}
