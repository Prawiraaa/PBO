public class Jokes {
    // String to store the joke
    private static String joke_string;

    // Function to determine if a joke is funny or not
    public static void is_funny() {
        // Check if the length of the joke is less than 20 characters (including spaces)
        if (joke_string.length() < 20) {
            System.out.println("It's funny");
        } else {
            System.out.println("It's not funny");
        }
    }

    // Function to get the first word of the joke, separated by space
    public static void first_word() {
        // Split the joke_string by space and get the first word
        String[] words = joke_string.split(" ");
        if (words.length > 0) {
            System.out.println(words[0]);
        } else {
            System.out.println("No word found");
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        joke_string = "Knock knock who's there?";
        is_funny();
        first_word();
        
        joke_string = "Your life";
        is_funny();
        first_word();
    }
}
