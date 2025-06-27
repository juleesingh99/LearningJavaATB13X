package ex_10_ForLoop;

public class Lab_102_ForLoop_No_Condition {
    public static void main(String[] args) {
        for(int i=0;;i++)
        {
            System.out.println(i);
            // process finished with exit code 130, means it is killed /stopped by user
            //exit code 0, program successfully ran
        }
    }
}
