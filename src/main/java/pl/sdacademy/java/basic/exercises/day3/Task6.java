package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {

    private static final String INPUT_DATA_FORMATER = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert date [in format [" + INPUT_DATA_FORMATER + "]: ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATA_FORMATER);
        LocalDateTime nextLesson = LocalDateTime.parse(input, formatter);
        LocalDateTime now = LocalDateTime.now();
        long days = Duration.between(now,nextLesson).toDays();
        System.out.println("You have " + days + " days to next lesson");
        System.out.printf("You have %01d days to next lesson", days);

    }
}
