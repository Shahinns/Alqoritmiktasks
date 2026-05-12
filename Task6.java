package org.example;

import java.util.Scanner;

public class Task6 {

    public void sumOfDigits(){

        System.out.println("Bir eded daxil edin: ");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if(a > 0){

            int sum = 0;


            while (a > 0) {
                int reqem = a % 10;
                sum = sum + reqem;
                a = a / 10;
            }

            System.out.println("Rəqəmlərin cəmi: " + sum);
        }
    }
}