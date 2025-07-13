package ex_15_StringBuilderVsStringBuffer;

public class Lab144_StringBuilderBuffer {
    public static void main(String[] args) {
        String s0="Julee";
        String s1= new String("Julee");

        StringBuffer stringBuffer=new StringBuffer("Julee");
        StringBuilder stringBuilder=new StringBuilder("Julee");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
