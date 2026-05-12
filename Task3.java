package org.example;

import java.util.Scanner;

public class Task3 {

    public void fibonacci() {

        System.out.println("Neçə Fibonacci ədədi görmək istəyirsən? ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        int prev1 = 0;
        int prev2 = 1;

        System.out.println("Fibonacci ardıcıllığı:");


        if (n >= 1) {
            System.out.print(prev1 + " ");
        }
        if (n >= 2) {
            System.out.print(prev2 + " ");
        }


        for (int i = 2; i < n; i++) {

            int current = prev1 + prev2;
            System.out.print(current + " ");


            prev1 = prev2;
            prev2 = current;
        }

        System.out.println();
    }
}
