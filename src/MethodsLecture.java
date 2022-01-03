public class MethodsLecture {


    //Methods

    /*
    *A java method is a collection of statements that are grouped together to perform an operation.
    * Methods can be defined with or without parameters, as well with or without a return type.
     */

    // public static returnType nameOfMethod() {}

    public static int returnNum(int num) {
        return  num;
    }

    public static void leaveTheHouse(){
        System.out.println("I'm leaving the house ..");
    }

    //Method overloading
    /*
    * Method overloading is a way to define the same method with different
     */

    public static void main(String[] args) {
        returnNum(7);
        System.out.println(returnNum(7));
        leaveTheHouse();

    }
}
