package ex_13_Functions;

import java.util.Scanner;

public class Lab129_GradeCalculation {
    public static void main(String[] args) {
        //A: 90-100
        //
        //B: 80-89
        //
        //C: 70-79
        //
        //D: 60-69
        //
        //F: 0-59

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Marks");
        if(scan.hasNextInt())
        {

            int marks = scan.nextInt();
            System.out.println("you have entered " +marks );
            if (marks < 0 || marks > 100) {
                System.out.println("Please enter Valid marks");
            }
            else if (marks>=90 && marks<=100)
            {
                System.out.println("grade is A");


            }
            else if(marks>=80 && marks<=89)
            {
                System.out.println("Grade is B");
            }
            else if(marks>=70 && marks<=79)
            {
                System.out.println("Grade is C");
            }
            else if(marks>=60 && marks<=69)
            {
                System.out.println("Grade is D");
            }
            else if(marks>=50 && marks<=59)
            {
                System.out.println("Grade is E");
            }
            else if(marks>=40 && marks<=49)
            {
                System.out.println("Grade is F");
            }
            else
            {
                System.out.println("You are Fail");
            }
        }
        else
        {
            System.out.println("Please Enter sensible thing");
        }
    }
}
