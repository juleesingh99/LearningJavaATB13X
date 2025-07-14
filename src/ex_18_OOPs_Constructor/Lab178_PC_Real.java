package ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        Person p3=new Person();
        p3.name="Smita";
        System.out.println(p3.name);

        Person p2=new Person("Avyann", 89745679, "XYZ");
        System.out.println(p2.name);
        System.out.println(p2.address);
        System.out.println(p2.phone);
    }
}

class Person
{
    String name;
    long phone;
    String address;

    Person()
    {
        System.out.println("DC");
    }
    Person(String name_user, long phone_user, String address_user)
    {
        this.name=name_user;
        this.address= address_user;
        this.phone= phone_user;
    }
    Person(String name_user, long phone_user)
    {
        this.name=name_user;
        this.phone= phone_user;
    }
    Person(String name_user)
    {
        this.name=name_user;
    }
}