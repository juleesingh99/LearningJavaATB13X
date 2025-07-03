package test19THJune;

import java.util.Scanner;

public class Test19_11 {
    public static void main(String[] args) {

        System.out.println("please Enter the number whose factorial is needed");
        Scanner scanner=new Scanner(System.in);
        long num=scanner.nextLong();
        if (num<0)
        {
            System.out.println("Factorial does not exists");
        }
        else {
            long factorial=1;
            long i=num;
            while(i>1)
            {
                factorial = factorial*i;
                i--;
            }
            System.out.println("Factorial of " +num + "= "+factorial);

        }
    }
}
