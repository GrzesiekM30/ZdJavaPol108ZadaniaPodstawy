package pl.sdacademy.java.basic.exercises.day1;

public class Task12 {
    public static void main(String[] args) {
        int a = 19, b=4;
        System.out.println(ownModuloImplementation(a,b));
        System.out.println(ifOwnModuloImplementationIsCorrect(a,b));

    }
    private static int ownModuloImplementation(int a, int b) {
        return a - (a/b)*b;
    }
    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b){
        return ownModuloImplementation(a,b)==(a%b);
    }


}
