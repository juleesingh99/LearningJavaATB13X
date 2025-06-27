package ex_07_Increment_Decrement;

public class Lab_075_Advance_ID {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + ++a);
        System.out.println(a);

       /* line /exp ++a /a
       5 a=10,
       6 A=++a > 11 + B= ++a=12

       line 6 result= 23
       value of a at line 7=12
        */

    }
}
