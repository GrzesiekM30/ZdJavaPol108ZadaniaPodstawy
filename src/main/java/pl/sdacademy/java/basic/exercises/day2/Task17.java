package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int [] mainArray = gettingNumberFromUser(4);
        System.out.println(Arrays.toString(sortingArray(mainArray)));


    }
    private static int [] gettingNumberFromUser (int x){
        Scanner scanner = new Scanner(System.in);
        int [] basicArray = new int[x];
        int arrayIndex = 0;
        while (arrayIndex < x){
            System.out.print("Insert digit: ");
            int arrayNumber = scanner.nextInt();
            basicArray[arrayIndex] = arrayNumber;
            arrayIndex++;
        }
        return basicArray;
    }
    private static int [] sortingArray (int [] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return array;
    }
}
