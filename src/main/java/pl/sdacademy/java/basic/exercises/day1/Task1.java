package pl.sdacademy.java.basic.exercises.day1;
/*Wyświetl SDA bez użycia " lub '*/

public class Task1 {
    public static void main(String[] args) {
        displayWordUsingDecimalFormat();//metoda statyczna, nie potrzebuje obiektu
        System.out.println();
        Task1 task1 = new Task1();
        task1.dispalyWordUsingBinaryFormat();
        System.out.println();
        displayWordUsingHexFormat();
    }
    private static void displayWordUsingDecimalFormat(){
        char s = 83;//='S' z tabeli ASCII
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
    private void dispalyWordUsingBinaryFormat(){
        char s = 0b01010011;//zapis "01", musimy wcześniej podać "0b"
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
    private static void displayWordUsingHexFormat(){
        char s = 0x53;//zapis "16", musimy wcześniej podać "0x"
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
