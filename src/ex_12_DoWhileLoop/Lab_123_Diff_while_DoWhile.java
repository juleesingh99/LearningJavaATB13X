package ex_12_DoWhileLoop;

public class Lab_123_Diff_while_DoWhile {
    public static void main(String[] args) {
        int a=0;
        while(a<0)
        {
            System.out.println(a);
            a++;
        }
        do {
            System.out.println(a);
            a++;
        } while (a<0);

    }

}
