package ex_13_Functions;

import java.util.Scanner;

public class Lab_128_LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter The Year");
        Scanner scanner=new Scanner(System.in);

        if(scanner.hasNextInt())
        {
            int number = scanner.nextInt();
            System.out.println("you have entered Year " +number);
            if(number%4==0)
            {
                System.out.println("Entered year" +number + "is a Leap Year");
            }
            else {
                System.out.println("Entered year " +number + " is not a Leap Year");
            }
        }
        else
        {
            System.out.println("please enter Valid Year");
        }


    }

}
