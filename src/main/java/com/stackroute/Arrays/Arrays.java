package com.stackroute.Arrays;

public class Arrays {
    public static void main(String[] args) {

        //Example for Single Dimensional Array
        System.out.println("---------Single dimensional Arrays----------");

        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        //so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + arr[i]);
        }

        //Example for Multidimensional Arrays

        System.out.println("---------Multi dimensional Arrays----------");

        int arr1[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr1[i][j] + " ");

            System.out.println();
        }
    }
}


