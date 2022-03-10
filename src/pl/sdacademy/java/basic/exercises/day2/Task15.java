package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"ma", "Ala", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};
        System.out.println(chceckigIfArraysAreEqual(firstArray, secondArray));

        String[] firstArray1 = {"Ala", "ma", "kot"};
        String[] secondArray1 = {"Ala", "ma", "kota"};
        System.out.println(chceckigIfArraysAreEqual(firstArray1, secondArray1));

        String[] firstArray2 = {"Ala", null, "kota"};
        String[] secondArray2 = {"Ala", "ma", "kota"};
        System.out.println(chceckigIfArraysAreEqual(firstArray2, secondArray2));

        String[] firstArray3 = {"Ala", "ma", "kota"};
        String[] secondArray3 = {"Ala", null, "kota"};
        System.out.println(chceckigIfArraysAreEqual(firstArray3, secondArray3));

        String[] firstArray4 = {"Ala", null, "kota"};
        String[] secondArray4 = {"Ala", null, "kota"};
        System.out.println(chceckigIfArraysAreEqual(firstArray4, secondArray4));

    }
    private static boolean chceckigIfArraysAreEqual( String [] firstArray, String [] secondArray){
        return Arrays.equals(firstArray,secondArray);
    }
}
