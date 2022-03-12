package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    //można też -?\\d+(,\\d+)?
    public static final String NUMBER_VALIDATION = "-?[0-9]+(,[0-9]+)?";

    public static void main(String[] args) {
        System.out.println(isCorrectNumberFormat("1234,1234"));
        System.out.println(isCorrectNumberFormat("1234"));
        System.out.println(isCorrectNumberFormat("-1234"));
        System.out.println(isCorrectNumberFormat("-1234,134"));
        System.out.println();
        System.out.println(isCorrectNumberFormat("1234a1234"));
        System.out.println(isCorrectNumberFormat(",1234"));
        System.out.println(isCorrectNumberFormat("1234,"));
        System.out.println(isCorrectNumberFormat(","));
        System.out.println(isCorrectNumberFormat(""));

    }
    private static boolean isCorrectNumberFormat (String number){
        Pattern pattern = Pattern.compile(NUMBER_VALIDATION);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
