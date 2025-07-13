package ex_16_Array;

import java.util.Arrays;

public class Lab152_Array_print {
    public static void main(String[] args) {
        int[] marks={51, 100, 91, 87,90};
        System.out.println("------------------------");
        Arrays.sort(marks);// array is sorted in ascending order
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }


    }
}
