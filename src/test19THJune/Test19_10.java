package test19THJune;

import java.util.Scanner;

public class Test19_10 {
    public static void main(String[] args) {
       //print number from 1 to N
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Last Number");
        int N=scanner.nextInt();
        for (int i=1;i<=N; i++)
        {
            System.out.print(i+" ");
        }

    }
}
