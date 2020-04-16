package com.company;

public class Main {

    public static void main(String[] args) {
	    for (int i = 100; i > 10; i -= 10) {
            System.out.println(i);
        }
	    boolean isTrue = true;
	    int j = 0;
	    while (j < 100) {
	        j +=1;
	        if (j % 2 == 0) {
	            continue;
            }
        }
	    int x = 0;
	    do {
            x++;
	        System.out.println(x);
        } while (x < 0);

    }
}
