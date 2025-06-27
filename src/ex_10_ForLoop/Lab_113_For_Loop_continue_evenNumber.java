package ex_10_ForLoop;

public class Lab_113_For_Loop_continue_evenNumber {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++) {
            if (i % 2 != 0)
            {
                continue;
            }
            System.out.println("even ->> "+i);
        }
    }
}
