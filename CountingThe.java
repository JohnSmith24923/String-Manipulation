package String_Programs;
// Rishi Shah; Counting The; Grade 11 Computer Science
import java.util.Scanner;

public class CountingThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the sentence to find the amount of times \"the\" is used: ");
        String sentence = sc.nextLine();
        String wordToFind = "the";
        int count = 0;
        int index = sentence.toLowerCase().indexOf(wordToFind);

        while (index != -1) {
            count++;
            index = sentence.toLowerCase().indexOf(wordToFind, index + wordToFind.length());
        }

        System.out.println("Number of occurrences of \"" + wordToFind + "\": " + count);
        sc.close();
    }
}