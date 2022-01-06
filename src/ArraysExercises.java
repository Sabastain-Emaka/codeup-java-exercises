import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {


    // What happens when you run the following code?
        //int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(numbers);

        // When the above code is run, the output is
        // [I@4ba1f711

        // Why is Arrays.toString necessary?

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //Arrays.toString create the literals and the exact values

        //An array that holds three persons

       Person p1 = new Person("Jevi");
       Person p2 = new Person("Ako");
       Person p3 = new Person("Ambusi");

       Person[] people = new Person[3];
       people[0] = p1;
       people[1] = p2;
       people[2] = p3;

       for (int i = 0; i < people.length; i+= 1) {
           System.out.println(people[i].getName());
       }





    }
}
