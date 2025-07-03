package test19THJune;

import java.util.Scanner;

public class Test19_14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a first size for triangle");

        int size1=scanner.nextInt();
        //System.out.println("Enter a base of triangle");*/

        //int size2=scanner.nextInt();
        System.out.println("right angle triangle");
        for(int i=1;i<=size1;i++)
        {
            for(int j=1; j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("pyramid");
        for (int i = 1; i <= size1; i++) {
            // print spaces
            for (int space = 1; space <= size1 - i; space++) {
                System.out.print("  ");
            }

            // print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }

    }
}
