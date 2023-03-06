package com.bridgelabz;

public class ArrayElementOnEvenPosition {

    public static void main(String[] args) {

        String[] array = {"Akhil", "Abhilash", "Bankim", "Santoshi", "Subham", "Sophia", "Shipra"};
        int arrayIndex = 0;
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("The even index number is: " +i +" And the element of the index is: "+array[i]);
            }
        }
    }
}
