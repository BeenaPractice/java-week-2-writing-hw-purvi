package homework_week_6;

import java.util.Scanner;

public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        // closing the scanner object
        scanner.close();
    }

    // Converting decimal to binary
    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }

}
