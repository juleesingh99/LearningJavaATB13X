package ex_16_Array;

import java.util.Scanner;

public class Lab164_2D_Multiplication_Table {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of star triangle");
        int size=scanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(i*j + " | ");

            }
            System.out.println();
        }

    }
}
