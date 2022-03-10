package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many words would you like insert? ");
        int numberOfWords = scanner.nextInt();
        System.out.println(gettingLastCharOfWord(numberOfWords));
    }
    private static String gettingLastCharOfWord(int numberOfWords){
        Scanner scanner = new Scanner(System.in);
        String finalWord="";
        int i = 1;
        char result;
        do{
            String word = scanner.nextLine();
            result = word.charAt(word.length()-1);
            finalWord=finalWord.concat(String.valueOf(result));
           i++;
        }while (i<=numberOfWords);
        return finalWord;
    }
}
