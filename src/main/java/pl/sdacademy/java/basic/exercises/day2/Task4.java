package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your sentence:");
        String sentence = scanner.nextLine();
        System.out.println(changingSententenc(sentence));
    }
    private static String changingSententenc(String sentenc){
        return sentenc.replaceAll("[.,]","-STOP-");
    }
}
