package org.example;

public class Task2 {


    public void task2(){

        int array[] = {2 , 5 , 9 , 14};


        int max = array[0];
        int max2 = array[0];

        for (int i = 0 ; i < array.length  ; i++) {


            if (max <= array[i]){

                max2 = max;
                max = array[i];

            }




        }


        System.out.println(max2);

    }
}
