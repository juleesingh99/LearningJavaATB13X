package ex_15_StringBuilderVsStringBuffer;

public class Lab146_SB {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Julee");
        stringBuilder.append(123);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
    }
}
