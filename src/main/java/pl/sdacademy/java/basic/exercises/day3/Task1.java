package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static final String EMAIL_REGEX = "[a-zA-Z0-9._]+@[a-zA-Z]+(\\.[a-zA-Z]+)*";

    public static void main(String[] args) {
        System.out.println(emailIsValid("sda1@com.pl"));
        System.out.println(emailIsValid("p.dudko@com.pl"));
        System.out.println();
        System.out.println(emailIsValid("@@com.pl"));
        System.out.println(emailIsValid("sda@sda1.com"));
        System.out.println(emailIsValid("sda"));

    }

    private static boolean emailIsValid( String emailAddress){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}
