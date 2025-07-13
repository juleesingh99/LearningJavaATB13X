package ex_16_Array;

import java.util.Arrays;

public class Lab_157_InterviewQ_SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers={12,34, 2, 100,3,5,32};

        //  easiest way
        Arrays.sort(numbers);
        int Second_largest=numbers[numbers.length-2];
        System.out.println(Second_largest);


    }
}
