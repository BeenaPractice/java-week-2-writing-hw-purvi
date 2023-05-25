package homework_week_6;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/

import java.util.Scanner;

public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to Java programme to add two binary numbers");
        //Scanner declaration for reading input from
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first binary number :");
        String first = scanner.nextLine();
        System.out.println("Please enter second binary number");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumber(first,second);
        System.out.println("The addition of two binary number is : "+ addition);
        // closing the scanner object
        scanner.close();
    }
    // adding two binary numbers
    public static String addTwoBinaryNumber(String first, String second){
        int b1 = Integer.parseInt(first,2);
        int b2 = Integer.parseInt(second,2);
        int sum = b1+b2;
        return Integer.toBinaryString(sum);
    }
}
