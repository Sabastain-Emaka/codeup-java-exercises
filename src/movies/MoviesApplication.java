package movies;

import util.Input;

public class MoviesApplication extends MoviesArray {
    static Input input = new Input();
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean userContinue = true;
        do {
            System.out.println("Which movie action do you want to take");
        }
    }


}
