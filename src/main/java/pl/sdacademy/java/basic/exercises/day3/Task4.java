package pl.sdacademy.java.basic.exercises.day3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your input");
        String input = scanner.nextLine();
        System.out.println(checkintIfSneez(input));
    }
    private static boolean checkintIfSneez (String input){
        Pattern pattern = Pattern.compile("^a+");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();


    }
}
