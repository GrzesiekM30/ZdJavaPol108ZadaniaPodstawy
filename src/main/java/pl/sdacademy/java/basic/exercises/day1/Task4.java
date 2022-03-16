package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    private final static double optimalMaxBmi = 24.9;
    private final static double optimalMinBmi = 18.5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert weight in kg: ");
        float weight = scanner.nextFloat();
        System.out.print("Please insert height in cm: ");
        float height = scanner.nextFloat()/100;
        double bmi = BMI(weight,height);
        CheckBMI(bmi);
    }
    private static double BMI (float weight, float height){
        double bmi = weight/(Math.pow(height,2));
        return bmi;
    }
    private static void CheckBMI(double bmi){
        if(optimalMinBmi<=bmi&&bmi<=optimalMaxBmi){
            System.out.print("BMI is correct:" + bmi);
        }else {
            System.out.print("BMI is not correct:" + bmi);
        }
    }
}
