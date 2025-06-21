package ex_06_Ternary_Operator;

public class Lab068_TO_ThreeMax {
    public static void main(String[] args) {
        // find the maximum between three numbers
        // input output identify
        //input int, output String

        // rough logic if n1> n2 and n1>n3 then n1 is maximum
        // n2>n3 and n2> n1 then n2 is maximum
        // otherwise n3 in max


        int n1=2;
        int n2= 9;
        int n3=-11;
        //
        int max = (n1>n2) ? (n1 >n3) ? n1:n3 : (n2>n3) ? n2:n3;
        System.out.println(max);


        int max1 = ( (n1 > n2) ? n1 : n2 ) > n3
                ? ( (n1 > n2) ? n1 : n2 )
                : n3;

        /* int max = ((a > b) ? a : b)   // this finds max betwwn A and B
           > c              // now asks if that result is > c
         ? ((a > b) ? a : b) // if yes, max = the result of (a>b)?a:b
         : c;               // otherwise, max = c*/

        System.out.println(max1);
    }
}
