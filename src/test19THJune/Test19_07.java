package test19THJune;
import java.util.Scanner;

public class Test19_07 {
    public static void main(String[] args) {

        System.out.println("Enter The Year");
        Scanner scanner=new Scanner(System.in);

        if(scanner.hasNextInt())
        {
            int year = scanner.nextInt();
            System.out.println("you have entered Year " +year);
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println("Entered year" +year + "is a Leap Year");
            }
            else {
                System.out.println("Entered year " +year + " is not a Leap Year");
            }
        }
        else
        {
            System.out.println("please enter Valid Year");
        }



    }
}
