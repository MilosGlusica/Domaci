/*
Napisati funkciju koja vraca niz tako sto se prosledjen niz deli na 2 polovine i novom nizu se
dodeljuje zbir cifara na istim pozicijama.

Npr: [1, 2, 3, 4, 5] => [1, 2, 3] + [3, 4, 5] => [4, 6, 8] <- ovo treba vratiti*/

import java.util.Arrays;

public class Zadatak9 {

    public static int[] returnHalfArraysSum(int [] array){
        //uslov sta se desava sa duzinom kada je niz parn ili neparn
        int arrayLength = 0;
        if (array.length % 2 == 0){
            arrayLength = array.length / 2;
        } else {
            arrayLength = (array.length / 2) +1;
        }
        // deklaracija dvda niza, njihovo deljenje i sabiranja
        int[] arrOne = new int[arrayLength];
        int[] arrTwo = new int[arrayLength];
        int[] arraySum = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (array.length % 2 == 0){
                arrOne[i] = array[i];
                arrTwo[i] = array[i + arrayLength];
                arraySum[i] = arrOne[i] + arrTwo[i];
            } else {
                arrOne[i] = array[i];
                arrTwo[i] = array[i + arrayLength -1];
                arraySum[i] = arrOne[i] + arrTwo[i];
            }

        }
        return arraySum;
    }

    public static void main(String[] args) {
        int[] arrayNew = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(returnHalfArraysSum(arrayNew)));
    }
}
