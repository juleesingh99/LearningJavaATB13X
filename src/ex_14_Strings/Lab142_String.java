package ex_14_Strings;

public class Lab142_String {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        String str3= new String("Hello");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equalsIgnoreCase(str3));

    }
}
