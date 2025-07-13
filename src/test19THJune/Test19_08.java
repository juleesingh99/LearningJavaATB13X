package test19THJune;

import java.util.Scanner;

public class Test19_08 {
    public static void main(String[] args) {
        System.out.println("enter days between 1 to 7");
        Scanner scanner=new Scanner(System.in);
        int day= scanner.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Monday");
                break;
                default:
                System.out.println("Not a weekday");
                break;


        }
    }
}
