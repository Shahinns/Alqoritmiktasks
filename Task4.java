package org.example;

import java.util.Arrays;

public class Task4 {


    public void rotateArray() {

        int array[] = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Əvvəlki massiv:");
        System.out.println(Arrays.toString(array));


        n = n % array.length;


        int rotated[] = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + n) % array.length;
            rotated[newIndex] = array[i];
        }

        System.out.println("Rotate olunmuş massiv (n=" + n + "):");
        System.out.println(Arrays.toString(rotated));
    }




}
