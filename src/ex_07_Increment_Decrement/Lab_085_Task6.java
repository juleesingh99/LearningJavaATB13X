package ex_07_Increment_Decrement;

public class Lab_085_Task6 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x; // 5 +7+7+9=28

        System.out.println("x = " + x + ", y = " + y); // 9, 28
    }
}
