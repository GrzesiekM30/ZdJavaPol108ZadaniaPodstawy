package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int digit;
        int nubersOfDigit = 0;
        int numberOfEvenDigit = 0;
        int totalSum = 0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert digit:");
            digit = scanner.nextInt();
            nubersOfDigit+=1;
            totalSum+=digit;
            if (digit%2==0){
                numberOfEvenDigit+=1;
            }
        }while (digit!=0);
        System.out.println("Total numbers of digit " + --nubersOfDigit);
        System.out.println("Total numbers of even digit " + --numberOfEvenDigit);
        float arithmeticAverage = (float) totalSum/nubersOfDigit;
        System.out.println("Arithmetic Average " + arithmeticAverage);
    }
}
