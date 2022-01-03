import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String KeepTalkingToBob = "y";

        while (KeepTalkingToBob.equalsIgnoreCase("y")) {
            System.out.println("SaySomethingToBob");

            String SayThisToBob = input.nextLine();
            if (SayThisToBob.endsWith("?")) {
                System.out.println("sure");
            } else if(SayThisToBob.endsWith("!")) {
                System.out.println("whoa, chill out!");
            } else if (SayThisToBob.length() == 0){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("whatever");
            }
            System.out.println("keep talking to Bob? Y/N" );
            KeepTalkingToBob = input.nextLine();


        }

    }
}
