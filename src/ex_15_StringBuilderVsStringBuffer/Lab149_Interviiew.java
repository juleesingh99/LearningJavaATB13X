package ex_15_StringBuilderVsStringBuffer;

import java.util.Locale;

public class Lab149_Interviiew {
    public static void main(String[] args) {
        //Java program to count Vowels and consonant
        // a, e ,i ,o ,u
        //Rest Consonant
        //Julee --> 3 vowels., consonants= rest
        String input="Java Program to Count Vowels and Consonants";
        int vowel=0;
        int consonant=0;

        input=input.toLowerCase();
        System.out.println(input);
        input=input.trim();
        System.out.println(input);
        input=input.replaceAll(" ","");
        System.out.println(input);

        for(int i=0; i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowel++;
            }
            else
                consonant++;
        }

        System.out.println("number of vowels "+vowel);
        System.out.println("number of consonants "+consonant);



    }


}
