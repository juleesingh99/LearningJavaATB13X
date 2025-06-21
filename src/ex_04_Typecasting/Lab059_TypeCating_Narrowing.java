package ex_04_Typecasting;

public class Lab059_TypeCating_Narrowing {
    public static void main(String[] args) {
        int val=300;
        // byte b= val ;  not allowed in java. need to do typecasting here
        byte b1= (byte)val;
        System.out.println(b1);

       /* 300 will stored in 32 bits . when converted to byte only 8 bits will be taken
       * 00000000000000000000000100101100
       * 00101100 only this much will be taken as byte


       * */
    }
}
