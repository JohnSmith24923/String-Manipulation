package String_Programs;
// Rishi Shah; Cutting and Splicing Program for String Programs; Grade 11 Computer Science
import java.util.Scanner;

public class Cutting_and_splicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();

        String modifiedSentence = removeWord(sentence, "secret");
        modifiedSentence = removeWord(modifiedSentence, "secrets");

        while (modifiedSentence.contains("secret") || modifiedSentence.contains("secrets")) {
            modifiedSentence = removeWord(modifiedSentence, "secret");
            modifiedSentence = removeWord(modifiedSentence, "secrets");
        }

        System.out.println("Modified sentence: " + modifiedSentence);

        sc.close();
    }

    static String removeWord(String sentence, String wordToRemove) {
        int index = sentence.indexOf(wordToRemove);

        if (index != -1) {
            String firstPart = sentence.substring(0, index);
            String secondPart = sentence.substring(index + wordToRemove.length());

            return (firstPart.trim() + " " + secondPart.trim()).trim();
        }

        return sentence;
    }
}

