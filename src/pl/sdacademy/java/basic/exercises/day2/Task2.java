package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert word:");
        String word = scanner.nextLine();
        System.out.println("Insert prefix");
        String prefix = scanner.nextLine();
        System.out.println(checkingBeginnigOfWord(word,prefix));
    }
    private static boolean checkingBeginnigOfWord(String word, String prefix){
        boolean wordIsBeginigWithPrefix = word.startsWith(prefix);
        return wordIsBeginigWithPrefix;
    }
    /*private static boolean checkingEndingOfWord(String word, String prefix){
        boolean wordIsEndingWithPrefix = word.endsWith(prefix);
        return wordIsEndingWithPrefix;*/
}
