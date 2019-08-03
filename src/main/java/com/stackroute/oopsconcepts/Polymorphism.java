package com.stackroute.oopsconcepts;

public class Polymorphism {


    // This sum takes two int parameters
    public int sum(int x, int y) {
        return (x + y);
    }


    // This sum takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }


    // This sum takes two double parameters
    public double sum(double x, double y) {
        return (x + y);
    }

    // Driver code
    public static void main(String args[]) {
        Polymorphism s = new Polymorphism();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}


