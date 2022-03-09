package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Insert char:");
        char character = scanner.nextLine().charAt(0);
        System.out.println("Result " + calculatingAndReturnigSumOfCharInSentence(sentence,character));
    }
    private static int calculatingAndReturnigSumOfCharInSentence(String sentence, char character){
        int sentenceLenght = sentence.length();
        int sumOfCharInSentence = 0;
        for (int i = 0; i < sentenceLenght; i++){
            if(sentence.charAt(i)==character){
                sumOfCharInSentence++;
            }
        }
        return sumOfCharInSentence;
    }
}
