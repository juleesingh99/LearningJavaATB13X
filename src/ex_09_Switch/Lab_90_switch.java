package ex_09_Switch;

import java.util.Scanner;

public class Lab_90_switch {
    public static void main(String[] args) {
//take user input and tell them the day
        // 1-7 , if 1 then Monday , 5 then Friday.. 8 and above not allowed/error
      //  int day=Integer.parseInt(args[0]);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day= scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
               break;
            case 2:
                System.out.println("tues");
              break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("not allowed");

        }


    }
}
