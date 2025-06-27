package ex_07_Increment_Decrement;

public class Lab_079_De_01 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(a-- + --a);
        System.out.println(a);
        /*
        line 5 a=10
        line 6 ( expression A=a-- >> 10 , a= 9, again exp B =8, a =8, result will be 10+8=18, a=8
         */
    }
}
