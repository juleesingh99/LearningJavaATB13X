package ex_15_StringBuilderVsStringBuffer;

public class Lab147_Sbuildewr {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);
    }
}
