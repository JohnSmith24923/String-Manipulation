package String_Programs;

import java.util.Scanner;

// Rishi Shah; Mr Harwood;  Grade 11 Computer Science 

public class SecondWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a sample sentence: ");
        String sentence = sc.nextLine();
        String secondWord = "";

        int firstSpaceIndex = sentence.indexOf(' '); // Find the index of the first space
        if (firstSpaceIndex != -1) {
            int secondSpaceIndex = sentence.indexOf(' ', firstSpaceIndex + 1); // Find the index of the second space
            if (secondSpaceIndex != -1) {
                secondWord = sentence.substring(firstSpaceIndex + 1, secondSpaceIndex); // Extract the second word
            } else {
                secondWord = sentence.substring(firstSpaceIndex + 1); // If there is no second space, extract till the end
            }
        }

        System.out.println("Second word: " + secondWord);
        sc.close();
    }
}

