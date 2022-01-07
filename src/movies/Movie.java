package movies;

public class Movie {

    //private fields

    private String name;
    private String category;

    // setters and getters

    public String getName(){
        return  name;
    }

    public void setName(String n){
        this.name = n;
    }

    public  String getCategory(){
        return category;
    }

    public void setCategory(String c){
        this.category = c;
    }

    //Constructor


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Citizen Kane", "drama");
        System.out.println(m1.name);
    }
}
