import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String[] args) {
//        String firstName = "EMAKA";
//        String lastName = "WAKOYI";
//
//        System.out.printf("Hello, my name is %s", lastName, firstName);

        String firstName = "EMAKA";
        String lastName = "WAKOYI";
        double pi = 3.14159;
        int myFavoriteNumber = 13;

        System.out.printf("Hello, my name is %s, %s. The vaue of pi is: %d", lastName, firstName, myFavoriteNumber);

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your favorite number");
        String userInput = scanner.nextLine();
        System.out.printf("Your favorite color is : %s ", userInput);
        System.out.println(userInput);

    }
}
