package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text; // null
        text = "some text"; // Address of "some text"

//        dataType[] arrayName; // null
//        arrayName = new dataType[10]; // Address of the 10 elements of type datatype
//        dataType[] arrayName = new dataType[10];
        int[] newArrEx = new int[20];

        int[] numbers = new int[5]; // {0, 0, 0, 0, 0}
        numbers[0] = 5; // {5, 0, 0, 0, 0}
        numbers[2] = 0; // {5, 0, 0, 0, 0}
        numbers[4] = 10; // {5, 0, 0, 0, 10}

        int[] numbersPrintingEx = {5, 0, 0, 0, 10};
        System.out.println(numbersPrintingEx); // ADDRESS
        for (int i = 0; i < numbersPrintingEx.length; i++) {
            System.out.println(numbersPrintingEx[i] + " ");
        }

        char[] chars = {'a', 'b', 'c', 'd'};
//        // Index -1 out of bounds for length 4
//        System.out.println(chars[-1]);
//        // Index 4 out of bounds for length 4
//        System.out.println(chars[4]);
        System.out.println(chars); // abcd


    }
}