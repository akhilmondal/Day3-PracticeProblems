package com.bridgelabz;

public class SmallestElementOfTheArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
        int minimumElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimumElement) {
                minimumElement = array[i];
            }
        }
        System.out.println("The smallest element of the array is " + minimumElement);
    }
}
