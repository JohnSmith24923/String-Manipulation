package String_Programs;
// Created By Rishi Shah: Mr Harwood Period 4; Counts Vowel
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a word to find the amount of vowels in the sentence: ");
        String word = sc.nextLine();

        int Count_1 = CharAt(word);
        System.out.println("The vowel count via charAt(): " + Count_1);

        int Count_2 = CharArray(word);
        System.out.println("The vowel count via toCharArray(): " + Count_2);

        sc.close();
    }

    static int CharAt(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char vowel = word.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                count++;
            }
        }
        return count;
    }

    static int CharArray(String word) {
        int count = 0;
        word = word.toLowerCase();
        char[] characters = word.toCharArray();

        for (char vowels : characters) {
            if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
                count++;
            }
        }
        return count;
    }
}
