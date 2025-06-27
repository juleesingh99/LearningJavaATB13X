package ex_07_Userinput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("enter the String");
        Scanner scanner= new Scanner(System.in);
        System.out.println(scanner.next());
        System.out.println("enter th einteger");
        System.out.println(scanner.nextInt());

        System.out.println("enter double");
        System.out.println(scanner.nextDouble());

    }
}
