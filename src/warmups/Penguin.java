package warmups;

public class Penguin {
    private String name;
    private int weight;
    private String species;
    private char sex;

    public static boolean canFly() {
        return false;
    }

    public static boolean areEvil(){
        return true;
    }

    public Penguin(String name, int weight, String species, char sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }
}
