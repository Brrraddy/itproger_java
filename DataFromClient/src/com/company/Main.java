package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
	    int first, second = 51;
	    boolean isTrue = false;
	    System.out.println("Enter first num: ");
	    first = num.nextInt();
	    isTrue = first == 51;

	    if (first >= second && isTrue) {
            System.out.print("Num is norm");
            System.out.print("\n");
        }else if (first == 45) {
	        System.out.print("Num is equal 45");
	    }else{
	        System.out.print("Num is lower than " + second);
            System.out.print("\n");
	    }

	    switch (first) {
            case 51:
                System.out.print("Num is equal 51");
                System.out.print("\n");
                break;
            default:
                System.out.print("Num is sth");
        }
    }
}
