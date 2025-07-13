package ex_14_Strings;

import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {
        //palindrome of a number
        //s1== s1_revers
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter one String");
        String name=scanner.nextLine();
        System.out.println("you have entered " +name);
        String reverseName="";
        int length=name.length();
        for (int i=length-1;i>=0;i--)
        {
            reverseName=reverseName+name.charAt(i);
        }
        System.out.println("reverse name " +reverseName);
        if (name.equalsIgnoreCase(reverseName))
        {
            System.out.println("The entered name is a palindrome");
        }
        else
        {
            System.out.println("The entered name is not a palindrome");
        }
    }
}
