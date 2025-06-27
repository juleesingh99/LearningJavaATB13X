package ex_10_ForLoop;

public class Lab_114_forLoop_continue_Odd_number {
    public static void main(String[] args) {
        for (int i=0;i<=50; i++)
        {
            if(i%2==0)
            {
                continue;

            }
            System.out.println("odd  >> "+i);
        }
    }
}
