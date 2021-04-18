package Utilities;

import java.util.Random;

public class Password {
    public int[] PasswordGenerator(int pswd_lnth) {

        //With the help of Random method, we will generate random ASCII values
        // in the range of 33 (which is !) and 126 (which is ~).
        // Outer bound of the range is not included when generating random numbers.
        Random random = new Random();
        int[] password = new int[pswd_lnth];
        for (int i=0; i<pswd_lnth; i++) {
            password[i] = random.nextInt(127-33)+33;
        }
        return password;
    }
}
