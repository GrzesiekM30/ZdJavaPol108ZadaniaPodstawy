package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input opinion");
        String sentence = scanner.nextLine();
        double procent= caluclatingSaces(sentence);
        System.out.println(procent);

    }


    private static double caluclatingSaces(String sentence) {
        double procent=0;
        int count = 0;
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
              count+=1;
            }
        }
        procent=count/sentence.length();
        return procent*100;
}
}
