package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task7 {
    private static final String stopDecison = "Stop";
    public static void main(String[] args) {
        String decison;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Insert first digit: ");
            float firtsDigit = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Insert operation type: ");
            String operation = scanner.nextLine();
            System.out.println("Insert second digit: ");
            float secondDigit = scanner.nextFloat();
            scanner.nextLine();
            float result = calculate(firtsDigit,secondDigit,operation);
            System.out.println(result);
            System.out.println("Next operation or stop:");
            decison = scanner.nextLine();
        }while (!stopDecison.equals(decison));

    }
    private static float calculate(float firstDigit, float secondDigit, String operation){
        float result = 0;
        switch (operation){
            case "+":
                result=firstDigit+secondDigit;

                break;
            case "-":
                result=firstDigit-secondDigit;

                break;
            case "*":
                result=firstDigit*secondDigit;

                break;
            case "/":
                if (secondDigit==0){
                    System.out.println("Wrong operation");
                    System.exit(1);
                }else{
                    result=firstDigit/secondDigit;

                }
                break;
            default:
                System.out.println("Operator not found");
                System.exit(1);
        }
        return result;
    }


}
