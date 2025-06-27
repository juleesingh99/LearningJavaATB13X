package ex_10_ForLoop;

public class Lab_110_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        System.out.println("odd numbers");
        for (int i=3; i<=50; i=i+2)
        {

            System.out.println(i);
        }
        System.out.println("even numbers");
        for(int j=2; j<=50;j=j+2)
        {
            System.out.println(j);
        }

        //using if statement
        for(int k=1;k<=50;k++)
        {
            if(k%2==0)
            {
                System.out.println("even Number ...>"+k);
            }
        }
    }
}
