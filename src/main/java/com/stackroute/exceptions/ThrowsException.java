package com.stackroute.exceptions;

public class ThrowsException {
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        validate(10);
        System.out.println("Thanks for Voting");
    }
}
