package com.stackroute.boxing;
/*
Example for AutoBoxing
 */


public class AutoBoxing {

    public static void main(String args[]) {
        int a = 50;
        Integer a2 = new Integer(a);//Boxing

        Integer a3 = 5;//Boxing

        System.out.println(a2 + " " + a3);
    }
}

