
// This first part is my personal solution


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

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if (userInput > max || userInput < min) {
            System.out.println("Next Time");
            return  getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input need a num");
            System.out.println(e.getMessage());
            return  getDouble();
        }
    }
}


// copy and pasted tutor's own correction of the exercise for the sake of conformity

//package util;
//
//import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner = new Scanner(System.in);
//
//    public String getString() {
//        System.out.println("Please enter something.");
//        String userResponse = scanner.nextLine();
//        System.out.printf("You have entered: %s", userResponse);
//        return userResponse;
//    }
//
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        String userResponse = scanner.nextLine();
//        System.out.printf("You have entered: %s", userResponse);
//        return userResponse;
//    }
//
//    public boolean yesNo() {
//        System.out.println("Would you like to continue?");
//        String userResponse = scanner.next();
//        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean yesNo(String prompt) {
//        System.out.println(prompt);
//        String userResponse = scanner.next();
//        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int getInt(int min, int max) {
//        System.out.printf("Please enter a whole number between %d and %d. \n", min, max);
//        int userNum = scanner.nextInt();
//        if (userNum > max || userNum < min) {
//            return getInt(min, max);
//        }
//        return userNum;
//    }
//
//    public int getInt(String prompt, int min, int max) {
//        System.out.println(prompt);
//        int userNum = scanner.nextInt();
//        if (userNum > max || userNum < min) {
//            return getInt(min, max);
//        }
//        return userNum;
//    }
//
//    public int getInt() {
//        System.out.println("Please enter a whole number.");
//        int userNum = scanner.nextInt();
//        System.out.printf("You chose %d", userNum);
//        return userNum;
//    }
//
//    public double getDouble(double min, double max) {
//        System.out.printf("Please enter a number between %f and %f. \n", min, max);
//        double userNum = scanner.nextDouble();
//        if (userNum > max || userNum < min) {
//            return getDouble(min, max);
//        }
//        return userNum;
//    }
//
//    public double getDouble(String prompt, double min, double max) {
//        System.out.println(prompt);
//        double userNum = scanner.nextDouble();
//        if (userNum > max || userNum < min) {
//            return getDouble(min, max);
//        }
//        return userNum;
//    }
//
//    public double getDouble() {
//        System.out.println("Please enter a number.");
//        double userNum = scanner.nextDouble();
//        System.out.printf("You chose: %f", userNum);
//        return userNum;
//    }
//
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        double userNum = scanner.nextDouble();
//        System.out.printf("You chose: %f", userNum);
//        return userNum;
//    }
//
//
//
//}