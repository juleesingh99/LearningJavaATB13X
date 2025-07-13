package ex_14_Strings;

public class Lab135_StringImmutable {
    public static void main(String[] args) {
        String name="Julee";// String Constant Pool
        name.toUpperCase();
        System.out.println(name);// it will print Julee
       // System.out.println(name.toUpperCase());
name=name.toUpperCase();
        System.out.println(name);// afterr reassigning JULEE will be printed
    }
}
