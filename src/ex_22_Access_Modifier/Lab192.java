package ex_22_Access_Modifier;

public class Lab192 { public static void main(String[] args) {
        Son son=new Son();
        Father father=new Son();
      //  Son son1=new Father();
        son.weCanUse();
       // father.weCanUse();
    }

}

class Father{

    private int gold=10;
    int car=1;
    public int bhk3=1;

}
class Son extends Father{
    void weCanUse()
    {
       // System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);

    }
}