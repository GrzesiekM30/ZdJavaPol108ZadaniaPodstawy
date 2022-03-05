package pl.sdacademy.java.basic.exercises.day1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first digit:");
        int x = scanner.nextInt();
        System.out.println("Please insert second digit:");
        int y = scanner.nextInt();
        FirstCheck(x,y);
        SecondtCheck(x,y);
        ThirdtCheck(x,y);
        FourthtCheck(x,y);
    }
    private static void FirstCheck(int x,int y){
        boolean firstCheck = (x>y);
        System.out.println(firstCheck);
    }private static void SecondtCheck(int x,int y){
        boolean secondCheck = (x*3>y);
        System.out.println(secondCheck);
    }
    private static void ThirdtCheck(int x,int y){
        boolean thirdCheck = ((++x>y++)&&(--x<y++));
        System.out.println(thirdCheck);
    }
    private static void FourthtCheck(int x,int y){
        boolean fourthCheck = ((x*y)%2==0);
        System.out.println(fourthCheck);
    }
}
