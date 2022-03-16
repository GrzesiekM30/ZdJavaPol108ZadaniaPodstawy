package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
    private static void printMultiplicationTable(int multiplier,int minMultiplicand, int maxMultiplicand){
        for (int i = minMultiplicand; i<=maxMultiplicand; i++){
            int result = multiplier*i;
            System.out.println(multiplier + "*" + i + " = " + result);
        }
    }
}
