/*
1.Napisati funkciju koja vraca drugi najmanji element po redu.
2.Napisati funkciju koja vraca drugi najveci element po redu.
3.Napisati funkciju koja prima broj tipa int, a vraca broj koji se dobije tako sto se sve cifre saberu na
  sledeci nacin: Npr: 12345 = 1 - 2 + 3 - 4 + 5; 1234 = 1 - 2 + 3 - 4; 78901 = 7 - 8 + 9 - 0 + 1;
4.Napisati funkciju koja prima dva niza i ispisuje prvo prvi element iz prvog niza, pa prvi element iz drugog
  niza, pa drugi iz prvog .... Nizovi ne moraju da budu iste duzine!
  Npr: [1, 2, 8, 9] [3, 4, 5, 6, 7, -7] => 1 3 2 4 8 5 9 6 7 -7
5.Napisati funkciju koja proverava da li je zadati ceo broj veci od jedinice prost. Prosti brojevi su svi oni
  koji su deljivi samo sa samim sobom i sa jedinicom.*/

import java.util.Arrays;
import java.util.Collections;

public class Zadatak1 {

    public static void twoArrayCombine(int[] array, int [] arrayOne){
        int[] combine = new int [array.length + arrayOne.length];
        int lengthLong, lengthShort;
        int[] temp;
        if (array.length > arrayOne.length){
            lengthLong = array.length;
            lengthShort = arrayOne.length;
        } else {
            lengthLong = arrayOne.length;
            lengthShort = array.length;
            temp = arrayOne;
            arrayOne = array;
            array = temp;

        }
        for (int i = 0; i < lengthLong; i++) {
            int counter = 0;
            combine[i + counter] = array[i];
            if (i < lengthShort){
                combine[i + counter + 1] = arrayOne[i];
            }
            counter++;
        }
        for (int i = 0; i < lengthLong + lengthShort; i++) {
            System.out.print(combine[i] + " ,");
        }
    }

    public static int addNumbers(int num){
        // break number to simple digits and store them into array
        int temp = num;
        int counter = 0;
        while (temp != 0){
            temp /= 10;
            counter++;
        }
        int[] arrayNum = new int [counter];
        int tempArray = num;
        for (int i = counter - 1; i >= 0; i--) {
            arrayNum[i] = tempArray % 10;
            tempArray /= 10;
        }
        // do the operation of addition and subtraction
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            if (i % 2 == 0){
                sum += arrayNum[i];
            } else {
                sum -= arrayNum[i];
            }

        }
        return sum;
    } //3. Problem

    public static int returnSecondBiggest(int[] array){
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] > array[j - 1]){
                    temp = array[j - 1];
                    array[j -1] = array[j];
                    array[j] = temp;
                }
            }
        }
        //Arrays.sort(array, Collections.reverseOrder()); // Array sort method -> promeniti int sa Integer
        return array[1];
    } // 2. Problem

    public static int returnSecondSmallest(int [] array){
         int temp = 0;
             for (int i = 0; i < array.length; i++) {
                     for (int j = i + 1; j < array.length; j++) {
                         if(array[i] > array[j]){
                             temp = array[i];
                             array[i] = array[j];
                             array[j] = temp;
                         }
                     }
             }
         //Arrays.sort(array); //// Array sort method
         return array[1];
     } // 1. Problem

    public static void main(String[] args) {

        int number = 123456789;
        int[] arrayAll = {0, 2, 4, 6, 8, 10, 12};
        int[] arrayTwo = {1, 3, 5, 7};
        /*if (arrayAll.length > 2){   // 1. second smallest number in array
            int secSmallest = returnSecondSmallest(arrayAll);
            System.out.println("the second smallest number out array is: " + secSmallest);
        } else System.out.println("Second smallest number doesn't exist!");*/ // 1. second smallest number in array

        /*if (arrayAll.length > 2){   // 2. second biggest number in array
            int secBiggest = returnSecondBiggest(arrayAll);
            System.out.println("the second biggest number out array is: " + secBiggest);
        } else System.out.println("Second biggest number doesn't exist!");*/ // 2. second biggest number in array

        //System.out.println("Sum of digits of a number is: " + addNumbers(number)); //3. Problem - sum

        twoArrayCombine(arrayAll, arrayTwo);

    }
}
