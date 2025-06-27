package ex_08_If_Else;

import java.util.Scanner;

public class Lab087_If {
    public static void main(String[] args) {
        System.out.println("enter the age");
        Scanner input=new Scanner(System.in);
        int age =input.nextInt();
        if(age>18)
        {
            System.out.println("allowed to vote");
        }
    }
}
