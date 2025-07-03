package test19THJune;


import java.util.Scanner;

public class Test19_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read three integers from user input
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        // Logic to find the largest number
        if (a == b && b == c) {
            System.out.println("All three numbers are equal.");
        } else if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
    }
}
