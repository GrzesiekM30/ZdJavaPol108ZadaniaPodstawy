package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To start timing press ENTER");
        String starter = scanner.nextLine();
        LocalTime startTime = LocalTime.now();
        if (starter.equals("")) {
            startTime = LocalTime.now();
            System.out.println(startTime);
        }
        System.out.print("To stop timing press ENTER");
        String stoper = scanner.nextLine();
        LocalTime endTime = LocalTime.now();
        if (stoper.equals("")) {
            endTime = LocalTime.now();
            System.out.println(endTime);
        }
        System.out.println("Total time: " + Duration.between(startTime,endTime).getSeconds() + " sec");
    }
}
