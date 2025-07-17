package ex_19_Inheritance.multiLevel_inheritance;

public class Lab183_MultiLevel {
    public static void main(String[] args) {
        Son son=new Son();
       // Son s1=new Father(); not possible
       // Son s2=new Grandfather(); not possible

      //  Grandfather g1=new Son();
     //   g1.gf();
      //  g1.home();// jiska object Uska function/attribute call hoga
//if son does not have that function, father's function will be called, if father also does not have that function then Grandfather's function will be called

        Grandfather g2=new Father();
        g2.gf();
      //  ((Father) g2).f();
        g2.home();
    }
}
