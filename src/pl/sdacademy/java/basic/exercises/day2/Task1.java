package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert word: ");
        String word = scanner.nextLine();
        System.out.println("Last Char " + returnigLastCharacter(word));
    }
    private static char returnigLastCharacter(String word){
        return word.charAt(word.length() - 1);
    }

}
