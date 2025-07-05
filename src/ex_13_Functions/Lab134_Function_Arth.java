package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=scanner.nextInt();

        System.out.println("Enter the num2");
        int num2=scanner.nextInt();
        int result=sum(num1,num2);

    }
    static int sum(int a, int b)
    {
        System.out.println("Sum Of entered number is " + (a+b));
        return a+b;
    }
}
