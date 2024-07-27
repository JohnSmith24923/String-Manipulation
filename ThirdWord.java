package String_Programs;
// Rishi Shah: Mr Harwood Period 4; Finding the ThirdWord

import java.util.Scanner;

public class ThirdWord {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine(); 

        String [] thirdword = input.split(" ");

        System.out.println("Every Third Word: ");

        for (int i = 2; i <thirdword.length; i += 3){
            System.out.println(thirdword[i]);
        }
        sc.close();
    }
}
