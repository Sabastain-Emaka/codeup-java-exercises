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
}
