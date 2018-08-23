package com.company;
import java.util.Scanner;

public class Main {

    public static StringBuffer CC(String message, int shift) {
        StringBuffer encrypted = new StringBuffer();
        for (int i=0; i<message.length(); i++) {
            if (Character.isUpperCase(message.charAt(i))) {
                char letter = (char)(((int)message.charAt(i) + shift - 65) % 26 + 65);
                encrypted.append(letter);
            }
            else if (Character.isLowerCase(message.charAt(i))){
                char letter = (char)(((int)message.charAt(i) + shift - 97) % 26 + 97);
                encrypted.append(letter);
            }
            else {
                encrypted.append(" ");
            }
        }
        return encrypted;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to encrypt...");
        String text = scanner.nextLine( );
        System.out.println("Enter a shift amount...");
        int shiftAmount = scanner.nextInt();
        System.out.println(CC(text, shiftAmount));
    }
}
