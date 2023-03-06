package com.bridgelabz;

public class ReverseElementOfTheArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Declaration of the array.
        for (int i = array.length-1; i >= 0; i--) { // Condition is given to get the element in reverse order.
            System.out.print(array[i] +" ");
        }
    }
}
