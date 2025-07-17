package ex_19_Inheritance.multiLevel_inheritance;

public class Lab182_Multi_Level {
    public static void main(String[] args) {
        Grandfather gf=new Grandfather();
        gf.gf();

        System.out.println("-------------");

        Father f1=new Father();
        f1.f();
        f1.gf();
        System.out.println("-------------");

        Son s1= new Son();
        s1.s();
        s1.f();
        s1.gf();
        System.out.println(s1.gold_gf);

    }
}
