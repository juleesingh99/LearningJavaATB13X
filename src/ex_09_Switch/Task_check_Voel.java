package ex_09_Switch;

import java.util.Scanner;

public class Task_check_Voel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the character");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch)
        {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
      default -> System.out.println("Consonant");
        }
    }
}
