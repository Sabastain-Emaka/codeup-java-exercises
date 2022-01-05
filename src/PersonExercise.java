import java.util.Locale;

public class PersonExercise {

     private String name;
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name.toLowerCase();
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
       System.out.printf("Hi, %s!\n", this.name);
    }

    //Constructor
    public PersonExercise(String name) {
        this.name = name;
        // this.setName(name);
    }

    public static void main(String[] args) {
        PersonExercise p1 = new PersonExercise("Jevian");
        System.out.println(p1.getName());
        p1.sayHello();



        //Testing
        PersonExercise person1 = new PersonExercise("John");
        PersonExercise person2 = new PersonExercise("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

//        PersonExercise person1 = new PersonExercise("John");
//        PersonExercise person2 = person1;
//        System.out.println(person1 == person2);
//
//        PersonExercise person1 = new PersonExercise("John");
//        PersonExercise person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

}
