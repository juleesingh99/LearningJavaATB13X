package ex_14_Strings;

public class Lab137_String_Immutable {
    public static void main(String[] args) {
        String S1="hello";
        S1.concat("world");
        System.out.println(S1);// hello will be printed
        // hello world will be printed after reassigning the value
        S1=S1.concat(" world");
        System.out.println(S1);

    }
}
