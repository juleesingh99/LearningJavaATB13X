package ex_15_StringBuilderVsStringBuffer;

public class Lab148_SB {
    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("Java");
        sb.append(" programming");
        System.out.println(sb);
        sb.delete(5,16);//Delete substring
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);

    }

}
