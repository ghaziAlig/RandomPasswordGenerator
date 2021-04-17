import Utilities.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Password passwordGenerator = new Password();

        System.out.print("\nEnter the length of password to generate:\t");
        int pswd_lnth = sc.nextInt();

        int[] arr = passwordGenerator.PasswordGenerator(pswd_lnth);

        System.out.println("\n\nThe randomly generated '" + pswd_lnth + "' digit password is:\n");
        for (int value : arr) {
            char digit = (char) value;
            System.out.print(digit);
        }
        System.out.println();

        //Do it again

        System.out.println("\n\nDo you wish to generate another password?\nEnter 'Y' if yes, any other character if no.");
        char ch = sc.next().charAt(0);
        if (ch == ('y' | 'Y')) {
            main(null);
        }
    }
}
