package com.practicebubblesort.app;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Constants declaration
        final int ELEMENTS_ARRAY = 100;

        //Variable declarations
        byte vectorNumbers[] = new byte[ELEMENTS_ARRAY];
        byte vectorOrdered[];

        //Object declaration
        Random random = new Random(System.nanoTime());

        //Process
        //Generate random numbers
        for (int i = 0; i < ELEMENTS_ARRAY; i++){
            vectorNumbers[i] = (byte) (random.nextInt(100) + 1);
        }

        //Call function BubbleSort
        vectorOrdered = BubbleSort(vectorNumbers);

        //Output Vector Asc
        System.out.println("Numbers Asc");
        for(int i = 0; i < vectorNumbers.length; i++){
            System.out.print(vectorOrdered[i]+"  ");
        }

        //Output Vector Desc
        System.out.println("\nNumbers Desc");
        for(int i = vectorNumbers.length-1; i >= 0; i--){
            System.out.print(vectorOrdered[i]+"  ");
        }
    }

    //Function bubble sort
    public static byte[] BubbleSort(byte vector[]){
        int aux = 0;
        //Process
        for (int i = 0; i < vector.length; i++){
            for(int j = 0; j < i; j++){
                if(vector[i] < vector[j]){
                    aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = (byte) aux;
                }
            }
        }
        return vector;
    }
}
