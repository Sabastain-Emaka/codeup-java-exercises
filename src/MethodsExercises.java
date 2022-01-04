import java.util.Scanner;

public class MethodsExercises {


        // 1 Basic Arithmetic Methods

       // addition
//    public static int addition(int a, int b) {
//        return (a + b);
//    }
//
//    //subtraction
//    public static int subtraction(int a, int b) {
//        return (a - b);
//    }
//
//    //multiplication
//    public static int multiplication(int a, int b) {
//        return (a * b);
//    }
//
//    //division
//    public static int division(int a, int b) {
//        return (a / b);
//    }
//
//    //modulus
//    public static int modulus(int a, int b) {
//        return (a % b);
//    }

        //bonus
//    public static int multiply(int x, int y) {
//        if (x == 0 || y == 0) {
//            return 0;
//        } else if (y > 0) {
//            System.out.println("x " + x);
//            System.out.println("y " + y);
//
//            int count = x + multiply(x, y - 1);
//
//            System.out.println("count " + count);
//
//            return count;
//        }
//        return multiply(x, y);
//    }


        // 2 Create a method that validates that user input is in a certain range
//        public static int getInteger(int min, int max){
//            Scanner scanner =  new Scanner(System.in);
//            int input = Integer.parseInt(scanner.nextLine());
//            if (input < min){
//                System.out.println("enter a number within the range");
//                return getInteger(min,max);
//            } else if (input > max){
//                System.out.println(" enter a number within the range");
//                return getInteger(min, max);
//            }
//            System.out.println("Good");
//            return input;
//        }


        // 3 Calculate the factorial of a number
//        public static void factorial(){
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a number to get the factorial: ");
//            int n = scanner.nextInt();
//            int result = factorial(n);
//            System.out.println("The factorial of " + n + " is " + result);
//        }
//
//        public static int factorial(int n) {
//            int result = 1;
//            for (int i = 1; i <= n; i++) {
//                result = result * i;
//            }
//            return result;
//        }

        //(4) Dice game
//    public static void dice() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many sides has a Dice?");
//        int dieSides = sc.nextInt();
//        System.out.print("do you want to  roll the dice? [y/N] ");
//        String userAnswer = sc.next();
//        boolean confirm = userAnswer.equalsIgnoreCase("y");
//        if(confirm) {
//            int a = (int) (Math.random() * dieSides);
//            int b = (int) (Math.random() * dieSides);
//
//            System.out.println("die 1 rolled: " + a + "\ndie 2 rolled: " + b);
//            dice();
//        }
//    }


    public static void main(String[] args) {

//              System.out.println(addition(7, 7));
//        System.out.println(subtraction(9, 6));
//        System.out.println(multiplication(4, 5));
//        System.out.println(division(8, 2));
//        System.out.println(modulus(20, 5));
//        System.out.println("times for loop " + times(2, 3));
//        factorial();
//        getInteger(1, 30);


    }

}
