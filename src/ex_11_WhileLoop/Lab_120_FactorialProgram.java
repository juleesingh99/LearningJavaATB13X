package ex_11_WhileLoop;

import java.util.Scanner;

public class Lab_120_FactorialProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to factorial Program\n enter the number");
        Scanner scanner=new Scanner(System.in);
        if(!scanner.hasNextInt())
        {
            System.out.println("Please enter Integer");
            return;
        }
        int number = scanner.nextInt();
        long fact=1l;
        if(number<0)
        {
            System.out.println("Negative factorial not allowed");
            return;
        }
       else if (number==0)
       {
           System.out.println(fact);
       }
       else
       {
           //calculate the factorial
           for(int i=1;i<=number;i++)
           {
               fact=fact*i;
           }
       }
        System.out.println("factorial is "+fact);


    }
}
