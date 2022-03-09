package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Insert char:");
        char character = scanner.nextLine().charAt(0);
        System.out.println(checkingAndRetutnigIndexOfCharInSentence(sentence, character));

    }

    private static int checkingAndRetutnigIndexOfCharInSentence(String sentence, char character) {
        Pattern pattern = Pattern.compile("[character]");
        Matcher matcher = pattern.matcher(sentence);
        boolean matches = matcher.find();
        if (matches){
            return sentence.indexOf(character);
        }else {
            return -1;
        }
    }
        /*for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                return i;
            }
        }
        return -1;
    }*/
}