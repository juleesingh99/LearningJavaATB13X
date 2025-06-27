package ex_11_WhileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task17June1 {
    public static void main(String[] args) {
        // Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=scanner.nextLine();
        String lowerName = name.toLowerCase();
        int constant=0;
        int vowel=0;
        for (int i=0; i<=lowerName.length()-1; i++)
        {
            char ch= lowerName.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'|| ch=='u')
            {
                vowel++;
            }
            else {
                constant++;
            }
        }
        System.out.println("number of vowel >>" + vowel + " number of constant >> " +constant + " in name entered " +name);
        }
}
