package com.practicebubblesort.app;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Declarations
        int vectorNumbers[] = new int[100];
        int vectorOrdered[];

        //Implements random
        Random random = new Random();

        //Process
        //Generate random numbers
        for (int i = 0; i < 100; i++){
            vectorNumbers[i] = random.nextInt(200);
        }
        vectorOrdered = BubbleSort(vectorNumbers);

        //Output ordered vector
        //Vector Asc
        System.out.println("Numbers Asc");
        for(int i = 0; i < vectorNumbers.length; i++){
            System.out.print(vectorOrdered[i]+"  ");
        }

        //Vector Desc
        System.out.println("\nNumbers Desc");
        for(int i = vectorNumbers.length-1; i >= 0; i--){
            System.out.print(vectorOrdered[i]+"  ");
        }
    }
    //Function bubble sort
    public static int[] BubbleSort(int vector[]){
        int aux = 0;
        //Process
        for (int i = 0; i < vector.length; i++){
            for(int j = 0; j < i; j++){
                if(vector[i] < vector[j]){
                    aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                }
            }
        }
        return vector;
    }
}
