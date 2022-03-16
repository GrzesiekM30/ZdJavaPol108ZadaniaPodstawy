package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task14 {
    public static final double MIN_A = 100.00;
    public static final double MAX_A = 10_000.00;
    public static final int MIN_I = 6;
    public static final int MAX_I = 48;
    public static final int MEDIUM_I1 = 12;
    public static final int MEDIUM_I2 = 24;
    public static final double PROCENT_1 = 1.025d;
    public static final double PROCENT_2 = 1.05d;
    public static final double PROCENT_3 = 1.1d;

    public static void main(String[] args) {
        double fullCredit;
        double instalment;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert amount: ");
        double amount = scanner.nextDouble();
        amount = VerifyAmount(amount);

        System.out.println("Please insert number of installments:");
        int numberOfInstallments = scanner.nextInt();
        numberOfInstallments = VerifyNumberOfInstalments(numberOfInstallments);

        fullCredit = FullCredit(amount,numberOfInstallments);
        instalment = Instalment(fullCredit,numberOfInstallments);
    }

    private static double VerifyAmount(double amount){
        if  (MIN_A > amount) {
            System.out.println("Amount is too small. Default value 1000,00 was set.");
            return amount = 1000;
        }else if(MAX_A < amount) {
            System.out.println("Amount is too big. Default value 5000,00 was set.");
            return amount = 5000;
        }else return amount;
    }

    private static int VerifyNumberOfInstalments(int numberOfInstallments) {
        if (MIN_I > numberOfInstallments) {
            System.out.println("Number of installments is too small. Default value 18 was set.");
            return numberOfInstallments = 18;
        }else if(MAX_I < numberOfInstallments){
            System.out.println("Number of installments is too big. Default value 36 was set.");
            return numberOfInstallments = 36;
        } else return numberOfInstallments;
    }

    private static double FullCredit(double amount, int numberOfInstallments) {
        double fullCredit;
        if (numberOfInstallments <= MEDIUM_I1) {
            return fullCredit = amount * PROCENT_1;
        } else if (numberOfInstallments <= MEDIUM_I2) {
            return fullCredit = amount * PROCENT_2;
        } else {
            return fullCredit = amount * PROCENT_3;
        }
    }

    private static double Instalment(double fullCredit, int numberOfInstallments){
        double instalment = fullCredit /numberOfInstallments;
        System.out.printf("Single instalment: %.2f", instalment);
        return instalment;
    }
}

