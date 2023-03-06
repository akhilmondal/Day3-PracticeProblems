package com.bridgelabz;

public class DuplicateElements {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6, 4, 5, 3, 6}; // Declaration of the array.
        System.out.println(array.length); // It will give us the lenght of the array.
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("The element " + array[i] + " is duplicate element. ");
                    break;
                }
            }
        }
    }
}
