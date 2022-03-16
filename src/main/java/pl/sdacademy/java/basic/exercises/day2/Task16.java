package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int [] array = new int[]{12, 7, 19, 33};
        System.out.println(Arrays.toString(revertinArray(array)));
    }
    private static int [] revertinArray(int [] array){
        int arrayLenght = array.length;
        int [] secondArray = new int[arrayLenght];
        int j = 0;
        for (int i = arrayLenght - 1;i >= 0;i--){
            secondArray[j] = array[i];
            j++;
        }
        return secondArray;
    }
}
