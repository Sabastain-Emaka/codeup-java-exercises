import java.util.Scanner;

public class ConsoleExercises {

    public  static void main(String[] args){

//        double pi = 3.14159;
//
//        String piMessage = String.format("The value of pi is approximately %.2f", pi);
//        System.out.println(piMessage);
//
//
//        System.out.printf("\"The value of pi is approximately %.2f\", pi");
//        System.out.format("\"The value of pi is approximately %.2f\", pi");

// 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        int userInput = sc.nextInt();
//        System.out.print("Your integer is:\n" + userInput);

        //What happens if you input something that is not an integer?


        // 2. Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.

     System.out.println("Pleas, enter 3 words");
     String firstWord = sc.next();
     String secondWord = sc.next();
     String thirdWord = sc.next();

     System.out.print("Your 3 words are:\n" + firstWord + "\n" + secondWord +"\n" + thirdWord);
     System.out.printf("%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

        //What happens if you enter less than 3 words?
        //What happens if you enter more than 3 words?

// 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
// Then, display that sentence back to the user.
//do you capture all the words?
        System.out.println("Please enter a sentence");

    }
}
