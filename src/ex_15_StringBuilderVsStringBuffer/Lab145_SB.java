package ex_15_StringBuilderVsStringBuffer;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Julee");
        stringBuffer.append(" Kumari");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

    }
}
