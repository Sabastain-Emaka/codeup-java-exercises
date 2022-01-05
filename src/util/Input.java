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

}
