package Utilities;

import java.util.Random;

public class Password {
    public int[] PasswordGenerator(int pswd_lnth) {
        Random random = new Random();
        int[] password = new int[pswd_lnth];
        for (int i=0; i<pswd_lnth; i++) {
            password[i] = random.nextInt(127-33)+33;
        }
        return password;
    }
}
