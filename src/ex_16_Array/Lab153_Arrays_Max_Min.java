package ex_16_Array;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        // find max and min value in Array
        int[] marks={25, 14, 56,15,36,56,77,18,29,49};
        Arrays.sort(marks);
        System.out.println("Minimum marks is " +marks[0]);
        System.out.println("Maximum marks is " + marks[marks.length-1]);
        //but this is not the right way to give max min number.
        // we will write new method
        int max_number= give_me_max(marks);
        System.out.println("maximum marks : "+max_number);
        int min_number= give_me_min(marks);
        System.out.println("minimum marks :" +min_number);

           }
           static int give_me_max(int[] array) {

        int max=array[0];
        //logic
        for (int i = 0; i < array.length; i++)

        {
            if (array[i]>max)
            {
                max = array[i];
            }
        }

        return max;

    }
    static int give_me_min(int[] array)
    {
        int min=array[0];
        //logic
        for (int i = 0; i < array.length; i++)
        {
            if (array[i]<min)
            {
                min = array[i];
            }
        }

        return min;

    }


}
