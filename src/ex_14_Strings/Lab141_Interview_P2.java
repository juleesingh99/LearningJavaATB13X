package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab141_Interview_P2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s4="Hello";
        String s10="Hello";

        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("hello");

        System.out.println(s1==s3);
        // this checks location refer
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        // equals >> checks content value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        // not equal due to case sensitivity

        System.out.println(s3.equalsIgnoreCase(s5));



    }
}
