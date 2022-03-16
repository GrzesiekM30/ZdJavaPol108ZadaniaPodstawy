package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;
import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        int [] mainArray = genertigArray();
        System.out.println(Arrays.toString(mainArray));
        int [] subArray = gettingRepeats(mainArray);
        for (int i = 0; i < subArray.length; i++){
            System.out.println(i + ":" + subArray[i] );
        }


    }
    private static int [] genertigArray(){
        Random random = new Random();
        int [] array = new int[10];
        for(int i = 0; i<10;i++){
            array[i] = random.nextInt(0,10);
        }
        return array;
    }
    private static int [] gettingRepeats (int [] array){
        int [] repeats = new int[10];
        for(int i = 0;i<10;i++){
            for(int j = i+1; j<10;j++){
                if (array[i]==array[j]){
                    repeats[array[i]]=1;
                    System.out.printf("");
                }
            }

        }
        return repeats;
    }
    /* private static int[] getDigitsRepeats(int[] array) {
        //int[] repeats = new int[11]; // dla przypadku gdy liczby mają być z zakresu 0-10
        int[] repeats = new int[10];
        for(int i = 0; i < array.length; i++) {
            repeats[array[i]]++;
            System.out.printf("");
        }
        return repeats;
    }*/
}
