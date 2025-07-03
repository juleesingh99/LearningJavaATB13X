package test19THJune;
import java.util.Scanner;

public class Test19_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        System.out.print("Enter an integer: ");
        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
        else
        {
            System.out.println("Please enter Number");
        }
    }
}
