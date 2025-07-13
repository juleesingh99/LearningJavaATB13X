package ex_16_Array;

public class Lab158_FindElementInArray_LinerSearch {
    public static void main(String[] args) {
        int[] a={23,43,45,67,87,90};
        // have to find element and its index
        // 67, index=3
        int target=67;

        for(int i=0;i<a.length;i++)
        {
            if (target==a[i])
            {
                System.out.println(target);
                System.out.println(i);
            }
        }
    }
}
