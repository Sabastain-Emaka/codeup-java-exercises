package movies;

import util.Input;

public class MoviesApplication extends MoviesArray {
    static Input input = new Input();
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean userContinue = true;
        do {
            System.out.println("Which movie action do you want to take?\n\n0-exit\n1-view movies in the animated category\\3 - view movies in the drama category\\n4 - view movies in the horror category\\n5 - view movies in the sci-fi category\\n6 - add a new movie\\n");
            System.out.println("Enter your choice: ");

        }while (userContinue);
    }


}
