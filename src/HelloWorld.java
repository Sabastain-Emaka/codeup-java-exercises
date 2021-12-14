public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World");

//        System.out.print("Hello ");
//        System.out.print("World ");
        System.out.println("Hello ");
        System.out.println(" World");

        byte month = 12;
        System.out.println(month);

        short daysInYear = 365;
        System.out.println(daysInYear);

        System.out.println('I');

        System.out.println("Hi \n World");

        System.out.println("Hi \t World");

        System.out.println("Hi \\ World");

        String greeting = "Hello, welcome to my block";

        String name;
        name = "Jay";

        System.out.println("greeting");

        float pi = 3.14f;
        System.out.println(pi);

//        double pi = 3.24355753390912343;
//        System.out.println(pi);

        // Cannot reassign the value of a final variable
        final String APIKEY = "";

        int firstNumber = 20;
        int secondNumber = 25;
        System.out.println(secondNumber % firstNumber);


//        int firstNumber = 204666655;
//        int secondNumber = 229884665;
        // returns negative  number due to int data type reaching MAX VALUE
//        System.out.println(firstNumber * secondNumber);

        int increment = 0;
        increment++;
        System.out.println(increment);

        int decrement = increment;
        decrement--;
        System.out.println(decrement);

        decrement += 5;
        System.out.println(decrement);

        int postIncrement = 0;
        postIncrement++;
        System.out.println(postIncrement);

//        int decrement = --postIncrement;
//        System.out.println(decrement);
//        decrement--;

        // Casting
        byte dayOfMonth = 14;
        byte birthday = 24;
        // returns the correct output blc the result of the expression by default in an int data type
        System.out.println(dayOfMonth * birthday);

        // cannot assign result to a byte data type
       // byte result dayOfMonth * birthday

        //Implicit Casting - less specific data type, to a more specific data type
        int result = dayOfMonth * birthday;

        // Explicit Casting- more specific data type, to less specific data type
        int x = 900;
        int y = 800;

        int difference = (byte)(x-y);
        System.out.println(difference);

    }

}
