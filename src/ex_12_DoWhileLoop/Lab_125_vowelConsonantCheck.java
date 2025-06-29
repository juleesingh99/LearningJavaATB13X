package ex_12_DoWhileLoop;

import java.util.Scanner;

public class Lab_125_vowelConsonantCheck {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the character");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        }
        else if (ch>='a' && ch<='z') {
            System.out.println(ch + " is consonant8");

        }
        else {
            System.out.println(ch + " is invalid");
        }
    }
}
