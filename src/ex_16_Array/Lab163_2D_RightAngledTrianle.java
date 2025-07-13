package ex_16_Array;

import java.util.Scanner;

public class Lab163_2D_RightAngledTrianle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of star triangle");
        int size=scanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
