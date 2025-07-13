package ex_16_Array;

import java.util.Scanner;

public class Lab165_2D_Left_triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of star triangle");
        int n=scanner.nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
