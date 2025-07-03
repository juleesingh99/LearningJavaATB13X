package test19THJune;


public class Test20_12 {
    public static void main(String[] args) {
        //multiplication number
        System.out.println("Table");
        for(int i=1;i<=5;i++){
            System.out.println("Table of "+i);

            for(int j=1;j<=10;j++)
            {
                System.out.printf("%d * %d = %d",i, j,i*j);
                System.out.println();
            }

        }
    }
}
