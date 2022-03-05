package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task2 {
    private final static float pi =  3.14F;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inster diameter:");
        float radius = scanner.nextFloat()/2;
        System.out.println("Circumference Of Circle: " + CircumferenceOfCircle(radius));
        System.out.println("Area Of Circle: " + AreaOfCircle(radius));
    }
    private static float CircumferenceOfCircle(float radius){
        //float circumference = 2*pi*radius;
        float circumference = (float)(2*Math.PI*radius);
        return circumference;
    }
    private static float AreaOfCircle(float radius){
        float area = (float) (Math.PI*Math.pow(radius,2));
        return area;
    }
}
