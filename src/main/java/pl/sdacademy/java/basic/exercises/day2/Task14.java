package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int [] array = new int[]{ 12, -7, 19, -5};
        int lenghtOfNegativArray = countNegativNumbersInArray(array);
        int [] negativArray = buildingArrayWithNegativs(array,lenghtOfNegativArray);
        System.out.println(Arrays.toString(negativArray));

    }
    private static int countNegativNumbersInArray(int [] array){
        int count = 0;
        for (int number : array){
            if(number < 0){
                count++;
            }
        }
        return count;
    }
    private static int[] buildingArrayWithNegativs( int [] array , int lenghtOfNegativArray){
        int [] arrayOfNegativs = new int [lenghtOfNegativArray];
        int j = 0;
        for(int number :array){
            if(number<0){
                arrayOfNegativs[j]=number;
                j++;
            }
        }
        return arrayOfNegativs;
    }
}
