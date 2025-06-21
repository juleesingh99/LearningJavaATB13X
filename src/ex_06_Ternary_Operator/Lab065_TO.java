package ex_06_Ternary_Operator;

public class Lab065_TO {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        //System.out.println(Math.max(x,y)); not use this as of now. use Ternary Operator
        int min = x<y ? x :y;
        System.out.println(min);
        int max = x>y ? x :y;
        System.out.println(y);
    }
}
