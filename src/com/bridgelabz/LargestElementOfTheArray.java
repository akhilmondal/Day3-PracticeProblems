package com.bridgelabz;

public class LargestElementOfTheArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
        int maxmumElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxmumElement) {
                maxmumElement = array[i];
            }
        }
        System.out.println("The largest element of the array is " + maxmumElement);
    }
}
