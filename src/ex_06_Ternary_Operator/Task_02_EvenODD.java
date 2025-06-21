package ex_06_Ternary_Operator;

public class Task_02_EvenODD {
    public static void main(String[] args) {
        int a=7;
        String result= (a % 2 == 0)? "even": "odd";
        System.out.println("The Given number is identified as "+result);
    }
}
