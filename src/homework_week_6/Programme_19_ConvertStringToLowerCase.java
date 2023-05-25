package homework_week_6;

import java.util.Scanner;

public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence:");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }
    // Converting string to lowercase
    public void convertStringToLowerCase(String str){
        System.out.println("The Lowercase of the string is: " + str.toLowerCase());
    }
}
