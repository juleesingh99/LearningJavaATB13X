package ex_18_OOPs_Constructor;

public class Lab177_PC {
    public static void main(String[] args) {
BabyA b1=new BabyA();
BabyA b2=new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);
        // this is not the correct way as we should not name everyone same
BabyA b3=new BabyA("Gulla", "12345",2024,8,17);
        System.out.println(b3.name);
        System.out.println(b3.aadhar_number);
        System.out.println(b3.year);
        System.out.println(b3.month);
        System.out.println(b3.day);


    }
}
class BabyA{
    String name;
    String aadhar_number;
    int year;
    int month;
    int day;


    // Defacult constructor
    BabyA()
    {
        name="dallu";
        aadhar_number="0000";
        year=2000;
        month=01;
        day=01;
    }
    BabyA(String user_name, String user_aadhar_number, int user_year, int user_month, int user_day)
    {
        this.name= user_name;
        this.aadhar_number=user_aadhar_number;
        this.year=user_year;
        this.month=user_month;
        this.day=user_day;
    }
}
