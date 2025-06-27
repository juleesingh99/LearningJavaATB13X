package ex_07_Userinput;

import java.util.Scanner;

public class Lab_UserInput_Scanner {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");
int age= scanner.nextInt();
        String vote= age >= 18 ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(vote);
    }}
