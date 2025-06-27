package ex_09_Switch;

import java.util.Scanner;

public class Task_TriangleClassification1 {
    public static void main(String[] args) {

        System.out.println("enter side 1");
        Scanner scanner=new Scanner(System.in);

        int s1=scanner.nextInt();
        System.out.println("enter side 2");
        int s2=scanner.nextInt();
        System.out.println("enter side 3");
        int s3=scanner.nextInt();
        if(s1==s2 && s2==s3)
        {
            System.out.println("equilateral Triangle");
        }
        else if (s1==s2 || s2==s3 || s3==s1)
        {
            System.out.println("isosceles triangle");


        }
        else
            System.out.println("scalene ");
    }
}


