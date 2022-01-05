package util;

import java.util.Scanner;

public class Input {
    Scanner scanner =new Scanner(System.in);

    private  Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }
    public String getString() {
        return sc.nextLine();
    }

    public boolean yesNo() {
        return getString().startsWith("y");
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if(userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("enter an integer between" + min + " " + " and " + max);
            return getInt(min, max);
        }
    }


    public int getInt() {
        try {
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("not a number");
            return getInt();
        }
    }
}
