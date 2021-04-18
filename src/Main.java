import Utilities.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create objects of Scanner and Password Class
        Scanner sc = new Scanner(System.in);
        Password passwordGenerator = new Password();

        //Declare identifier for password length and taking taking the input from user
        //If the input is not integral, then an exception is thrown
        int password_length ;
        while (true) {
            System.out.print("\nEnter the length of password to generate:\t");
            String input = sc.next();

            try {
                password_length = Integer.parseInt(input);
                break;
            }
            catch (NumberFormatException e) {
                System.out.print("\nEnter an integer only");
            }
        }

        //Calling the method from Password class and
        // getting the generated password from there with return statement
        int[] arr = passwordGenerator.PasswordGenerator(password_length);

        //The password method generates ASCII values
        // so we need to convert those into char before printing them.
        System.out.println("\n\nThe randomly generated '" + password_length + "' digit password is:\n");
        for (int value : arr) {
            char digit = (char) value;
            System.out.print(digit);
        }
        System.out.println();

        //Ask the user if he wishes to do it again
        System.out.println("\n\nDo you wish to generate another password?\nEnter 'Y' if yes, any other character if no.");
        char ch = sc.next().charAt(0);
        if (ch == ('y' | 'Y')) {
            main(null);
        }
    }
}
