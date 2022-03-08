package pl.sdacademy.java.basic.exercises.day1;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(0,100);
        RandomNumberGame(number);
    }
    private static void RandomNumberGame(int number){
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        do {
            System.out.print("Insert digit: ");
            userNumber = scanner.nextInt();
            if(userNumber>number){
                System.out.println("Too much");
            }else if (userNumber<number){
                System.out.println("Not enough");
            }else{
                System.out.println("Bingo!");
            }
        }while (userNumber!=number);
    }


}
