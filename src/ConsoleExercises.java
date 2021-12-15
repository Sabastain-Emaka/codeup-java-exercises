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

//     System.out.println("Pleas, enter 3 words");
//     String firstWord = sc.next();
//     String secondWord = sc.next();
//     String thirdWord = sc.next();
//
//     System.out.print("Your 3 words are:\n" + firstWord + "\n" + secondWord +"\n" + thirdWord);
//     System.out.printf("%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

        //What happens if you enter less than 3 words?
        // It still prints out all the words
        //What happens if you enter more than 3 words?
        // It still prints out all the words

// 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
// Then, display that sentence back to the user.
//
//        System.out.println("Please enter a sentence");
//        String userSentence = sc.next();
//        System.out.print("Your sentence is:\n" + userSentence);

        // do you capture all the words?
        // No, only the first word is display
   // 4 . Rewrite the above example using the nextLine method.
//        System.out.println("Please enter a sentence");
//        String userSentence = sc.nextLine();
//        System.out.print("Your sentence is:\n" + userSentence);
        // This prints out all the sentence now

        // Calculate the perimeter and area of Codeup's classrooms.
        // 1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        // Use the nextLine method each time you need to get user input.
        // In this case, we need it twice, once to get the user input for the length and again to get the user input for the width.
        // Parse the resulting strings to a numeric type.
        // Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.
        System.out.println("Please enter the length and width of Codeup classroom in feet");
        String width = sc.nextLine();
        String length = sc.nextLine();

        int w = Integer.parseInt(width);
        int l = Integer.parseInt(length);

        // 2. Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle
        // is equal to 2 times the length plus 2 times the width.
        System.out.println("The area of the room is " + (w * l) + "ft.");
        System.out.println("The perimeter of the room is " + ((w * 2) + (w * 2)) + "ft.");
    }
}
