package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task12 {
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_A_AND_Z_LETTER = 26;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your input");
        String inputToEncode = scanner.nextLine();
        System.out.println("Insert your shift");
        int shift = scanner.nextInt();
        System.out.println("Encoded input: " + encodingInputWithCeasarCipher(inputToEncode,shift));
    }
    private static String encodingInputWithCeasarCipher(String input, int shift){
        String encodedOutput = "";
        /*if (StringHelper.isValid(input)&&(shift!=0)){
            for(int i = 0; i <input.length();i++){
                char temporaryChar = (char)(input.charAt(i)+shift);
                encodedOutput = encodedOutput.concat(String.valueOf(temporaryChar));
            }
        }*/
        if (StringHelper.isValid(input)&&(shift!=0)){
            for(int i = 0; i <input.length();i++){
                if (input.charAt(i)<=VALUE_LOWER_Z_IN_ASCII && input.charAt(i)>=VALUE_LOWER_A_IN_ASCII){
                    char temporaryChar = (char)((input.charAt(i)-(VALUE_LOWER_A_IN_ASCII-shift))%DIFF_A_AND_Z_LETTER + VALUE_LOWER_A_IN_ASCII);
                    encodedOutput = encodedOutput.concat(String.valueOf(temporaryChar));
                }
            }
        }
        return encodedOutput;
    }
}
