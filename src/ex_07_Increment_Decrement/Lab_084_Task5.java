package ex_07_Increment_Decrement;

public class Lab_084_Task5 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a; // 5 +7 >> a=7, b=12

        System.out.println("a: " + a); // Output: 7

        System.out.println("b: " + b); // Output: ?12
    }
}
