package util;

public class InputTest {
    public static void main(String[] args) {
        Input input1 = new Input();

        System.out.println("Say something good");
        String Great = input1.getString();
        System.out.printf("you said: %s\n", Great);

        System.out.println("Let us continue");
        boolean yesNo = input1.yesNo();
        System.out.printf("You choose: %b\n", yesNo);

        System.out.println("Enter a whole number");
        int getInt = input1.getInt();
        System.out.printf("You entered: %d\n", getInt);

        System.out.println("enter a number between 1 and 15");
        int getInRange = input1.getInt(1,15);
        System.out.printf("You entered: %d\n", getInRange);
    }
}
