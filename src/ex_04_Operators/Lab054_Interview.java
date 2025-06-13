package ex_04_Operators;

public class Lab054_Interview {
    public static void main(String[] args) {
        char a1='A';
        char a2='B';
        System.out.println(a1+a2);
        // characters are integer
        System.out.println(a1==65);
        // character with interger behaves as integer and their ascii value is used
        // character alone prints the character value assigned

        String s1 ="A";
        System.out.println(a1+s1);
        // character added to string behaves as String
    }
}
