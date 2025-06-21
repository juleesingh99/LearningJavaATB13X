package ex_04_Typecasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        byte b=10;
        int a=b;
        int a1= (int)b; // but it is not needed in case of widening
        System.out.println(a);
        System.out.println(a1);
    }
}
