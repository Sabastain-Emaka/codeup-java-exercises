package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();

    public static void main(String[] args) {
        Student entoi = new Student("Ekoh");
        entoi.addGrade(100);
        entoi.addGrade(100);

       Student  mclato = new Student("Mbabo");
        mclato.addGrade(100);
        mclato.addGrade(80);

        Student mwanneh= new Student("Mbave");
        mwanneh.addGrade(100);
        mwanneh.addGrade(70);

        Student entoh= new Student("Ekombo");
        entoh.addGrade(100);
        entoh.addGrade(100);
    }

}
