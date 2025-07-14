package ex_17_OOPs;

public class Lab168_Cats {
    public static void main(String[] args) {
        Cat c1=new Cat();
        new Cat();
        Cat c2;
        c1.running();
        new Cat().running();
       // c2.running(); Cannot invoke "ex_17_OOPs.Cat.running() as no object has been created
    }
}

class  Cat{
    String name;

    void running()
    {
        System.out.println("Running");
    }

}
