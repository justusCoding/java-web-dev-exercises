package exercises;
import java.util.Scanner;

public class StringyStuff {
    public static void main (String[] args){

        String wonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        String NewWonderLand = wonderland.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String to search for:");


        String includesWord = input.nextLine().toLowerCase();
        Boolean result = NewWonderLand.contains(includesWord);


        System.out.println("The first sentence contains your search term: " + result);

        Integer index = NewWonderLand.indexOf(includesWord);
        Integer length = includesWord.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = NewWonderLand.replace(includesWord, "");
        System.out.println(modifiedSentence);



    }
}
