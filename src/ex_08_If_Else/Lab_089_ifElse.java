package ex_08_If_Else;

import java.util.Scanner;

public class Lab_089_ifElse {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scan =new Scanner(System.in);
        int age = scan.nextInt();
        if(age>=18)
        {
            System.out.println("allowed to vote as age is 18 and more");
        }
        else
        {
            System.out.println("not allowed");
        }
    }
}
