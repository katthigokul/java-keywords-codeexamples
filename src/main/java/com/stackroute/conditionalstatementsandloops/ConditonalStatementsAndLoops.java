package com.stackroute.conditionalstatementsandloops;


public class ConditonalStatementsAndLoops {

    public static void main(String[] args) {

        //Example for Loop
        //Creating an Array for Numbers
        int[] numbers = {10, 72, 300};
        System.out.println("----------Enhanced For Loop----------------");
        for (int num : numbers) {  // Applying condition on Numbers using Enhanced For Loop
            if (num > 100) {
                System.out.println(num + " is grater than 100");
            } else if (num > 50) {
                System.out.println(num + " is grater than 50");
            } else {
                System.out.println(num + " is less than 50");
            }
        }

        //Example for  While Loop

        System.out.println("--------while Loop-----------");
        int num = 0;
        while (num < numbers.length) {  //Applying conditions on Numbers using While Loop
            if (numbers[num] > 100) {
                System.out.println(numbers[num] + " is grater than 100");
            } else if (num > 50) {
                System.out.println(numbers[num] + " is grater than 50");
            } else {
                System.out.println(numbers[num] + " is less than 50");
            }
            num++;
        }

        //Example for  Switch Statement

        System.out.println("----------Switch Statement---------------");
        int x = 10;
        switch (x) {  //Applying condition on Variable x
            case 5:
                System.out.println("Value of x is 5");
                break;
            case 10:
                System.out.println("Value of x is 10");
                break;
            case 15:
                System.out.println("Value of x is 15");
                break;
            default:
                System.out.println("Unknown value");
                break;
        }

        //Example for Do while Loop

        System.out.println("----------Do Whie Loop---------------");

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);


        //Example for if else ladder

        System.out.println("--------------if else ladder-------------");

        //Creating variable for  marks

        int marks = 65;

        //Applying conditions marks

        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }

        //Example for Nested if else

        System.out.println("---------Nested if else----------------");

        //Creating two variables for age and weight

        int age = 25;
        int weight = 48;

        //applying condition on age and weight

        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
    }
}

