package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();
        if(firstDigit<secondDigit){
            int sum = sum1(firstDigit,secondDigit);
            System.out.println(sum);
        }else{
            int sum = sum1(secondDigit,firstDigit);
            System.out.println(sum);
        }
    }
    private static int sum1(int firstDigit, int secondDigit)
    {
        int sum=0;
        for (int i = firstDigit; i<=secondDigit;i++){
            sum+=i;
        }
        return sum;
    }
    private static int sum2(int firstDigit, int secondDigit)
    {
        int sum=0;
        while ( firstDigit<=secondDigit){
            sum+=firstDigit;
            firstDigit++;
        }
        return sum;
    }
}
