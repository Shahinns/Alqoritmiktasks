package org.example;

public class Task5 {

    public void sortArray(){

        int ededler[] = {2, 4, 1, 3};


        for (int i = 0; i < ededler.length - 1; i++){


            for (int j = 0; j < ededler.length - 1; j++){


                if (ededler[j] > ededler[j + 1]) {


                    int temp = ededler[j];
                    ededler[j] = ededler[j + 1];
                    ededler[j + 1] = temp;
                }
            }
        }


        System.out.println("Sıralanmış massiv:");
        for (int k = 0; k < ededler.length; k++) {
            System.out.print(ededler[k] + " ");
        }
    }
}