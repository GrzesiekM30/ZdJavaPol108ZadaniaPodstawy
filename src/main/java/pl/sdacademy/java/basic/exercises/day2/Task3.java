package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert input:");
        String input = scanner.nextLine();
        System.out.println("Insert word:");
        String word = scanner.nextLine();
        System.out.println(checkingPositionOfWordInIput(input,word));
    }
    private static int checkingPositionOfWordInIput(String input,String word){
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(input);
        boolean matches = matcher.find();
        if(word.equals("")){
            return -1;
        } else if (matches){
            return input.indexOf(word);
        }else {
            return -1;
        }
    }
}
