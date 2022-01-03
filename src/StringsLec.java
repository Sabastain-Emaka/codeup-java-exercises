import java.util.Scanner;

public class StringsLec {
    public static void main(String[] args) {

        char d = 'd';
        System.out.println(d == 'd');

        Scanner sc = new Scanner(System.in);
        String favoriteSoda = "Pepsi Wild Chery";
        System.out.println("Hey Jevian, what is your favorite soda?");
        String userSoda = sc.nextLine();
        System.out.printf("Jevian remmered his favorite soda, and typed it's name properly! %b", favoriteSoda.equals(userSoda));

    }
}
