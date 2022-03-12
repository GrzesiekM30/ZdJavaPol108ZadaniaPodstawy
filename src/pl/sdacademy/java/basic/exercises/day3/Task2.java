package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static final String IBAN_VALIDATION = "PL[0-9]{26}";

    public static void main(String[] args) {
        String iban1 = "PL15935785236974125896321456";
        String iban2 = "PL15935785236974632145";
        String iban3 = "P15935785236974632145";
        System.out.println(ibanIsValid(iban1));
        System.out.println(ibanIsValid(iban2));
        System.out.println(ibanIsValid(iban3));

    }
    private static boolean ibanIsValid (String iban){
        Pattern pattern = Pattern.compile(IBAN_VALIDATION);
        Matcher matcher = pattern.matcher(iban);
        return matcher.matches();
    }
}
