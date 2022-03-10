package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert word");
        String word = scanner.nextLine();
        System.out.println(isPalindrome(word));
    }
    private static boolean isPalindrome(String word){
        String revertedWord = new StringBuilder(word).reverse().toString();
        return word.equals(revertedWord);
    }
}
