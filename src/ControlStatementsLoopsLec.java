import java.util.Scanner;

public class ControlStatementsLoopsLec {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean hasPizzaRolls = true;
        boolean hasPepsiWildCherry = false;

//        System.out.printf("Are you prepare: %b%n", hasPizzaRolls && hasPepsiWildCherry);
//        System.out.printf("Are you prepare: %b%n", hasPizzaRolls || hasPepsiWildCherry);
//
//        System.out.printf("Will I stay hungry: %b%n", !hasPizzaRolls);
//        System.out.printf("Will I stay thirsty: %b%n", !hasPepsiWildCherry);
//
//        System.out.println(sc.nextBoolean() && sc.nextBoolean());
//        System.out.println(sc.nextBoolean() || sc.nextBoolean());

        // ------ Maths formulas
//        System.out.println("Did you bring enough apples for the class? How many do you have");
//        int SticksOfGum = sc.nextInt();
//
//        System.out.printf("Enough for everyone:%b%n", SticksOfGum >= 24);
//
//        System.out.println("How much vegetables");
//        int chuckablewood = sc.nextInt();
//
//        System.out.printf("Got 'em: %b%n", chuckablewood > 0);
//
//
//        System.out.println("How many Okros");
//        int lizzieSeasons = sc.nextInt();
//
//        System.out.printf("Knows Ambusi: %b%n",lizzieSeasons == 2);
        //sc.nextLine();

//        System.out.println("Who won the last edition of AFCON");
//        String number34 = sc.nextLine();
//
//        System.out.format("Morocco && Northern Africa: %b%n", number34.equalsIgnoreCase("Desert Forces"));
        //System.out.format("Morocco && Northern Africa: %b%n", number34.equals("Desert Forces"));

        // ----
//        if (chuckableWood > 0){
//            System.err.println("If a woodchuck could chuck wood.");
//        }
        //        if (number34.equalsIgnoreCase("Clyde Drexler")) {
//            System.out.println("He didn't join the Rockets until '95.");
//        } else if (!number34.equalsIgnoreCase("Hakeem Olajuwon")){
//            System.out.println("I guess we never could be friends...");
//            if (lizzieSeasons == 2) {
//                System.out.println("I take that back, we're cool.");
//            }
//        }



        //switch statement

//        switch (sticksOfGum) {
//            case 23:
//                System.out.println("That is just for all");
//                break;
//            case 22:
//                System.out.println("You are selfless");
//                break;
//            case 24:
//                System.out.println("No Gum in class");
//                break;
//            default:
//                System.out.println("No Gum");
//                break;
//        }

//        while (!number34.equalsIgnoreCase("Morocco")) {
//            System.out.println("You won");
//            number34 = sc.nextLine();
//        }

//        do {
//            System.out.println("How much wood do you have");
//            chuckableWood = sc.nextLine();
//        } while (chuckableWood > 0);

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
