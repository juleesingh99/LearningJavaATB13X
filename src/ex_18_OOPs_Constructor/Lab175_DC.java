package ex_18_OOPs_Constructor;

public class Lab175_DC {
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.year);
        c1.name="Tesla";
        System.out.println(c1.name);
    }
}
class Car{
    String name;
    int year;
    String model;

    //Default constructor
    Car()
    {
        name ="Unknown Car";
                year= 1991;
        model= "XXX";
    }
}