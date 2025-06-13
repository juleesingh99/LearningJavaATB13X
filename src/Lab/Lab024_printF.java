package Lab;

public class Lab024_printF {
    public static void main(String[] args) {
        int a=9;
        System.out.println("new line after print");
        System.out.print("no new line added");
        System.out.print("hello world");
        System.out.println();
        System.out.printf("variable name is %d",a);

        // %d >> int, byte, short datatype
        //%f >> float, double
        //%b >> Boolean
        // %s >> String

        int b = 1;
        System.out.println("------------");
        System.out.printf("%d + %d", a , b);
        System.out.println("table of 9");
        System.out.printf("%d * %d = %d" ,a, b, a*b);
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+1, a*(b+1));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+2, a*(b+2));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+3, a*(b+3));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+4, a*(b+4));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+5, a*(b+5));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+6, a*(b+6));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+7, a*(b+7));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+8, a*(b+8));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+9, a*(b+9));
        System.out.println();
        System.out.printf("%d * %d = %d" ,a, b+10, a*(b+10));




    }
}
