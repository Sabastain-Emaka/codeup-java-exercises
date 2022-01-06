public class ServerNameGenerator {

    public  static int randomWord(String[] arrays) {
        return (int) Math.floor(Math.random() * arrays.length);
    }

    public static void main(String[] args) {
        String[] adjectives = {"great", "excellent", "analyze", "effective", "above", "beyond", "champion", "assess","measure", "describe"};
        String[] nouns = {"Jevi", "Mbande", "Ande", "Akwenko", "Ebuepka", "Berabe", "Ako", "Assa", "Buku","Akwaja" };

        String adjective = adjectives[randomWord(adjectives)];
        String noun = (nouns[randomWord(nouns)]);

        System.out.printf("Your server name is:\n%s, \n%s", adjective, noun);
    }


}
