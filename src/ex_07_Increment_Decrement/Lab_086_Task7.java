package ex_07_Increment_Decrement;

public class Lab_086_Task7 {

    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x; // 5 + 7 +7+9=28 , x=9, y=28

        System.out.println("x = " + x + ", y = " + y);
    }
}
