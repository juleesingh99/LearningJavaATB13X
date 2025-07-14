package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1=new Baby();
    }
}

class  Baby {
    String name;

    Baby() {
        System.out.println("Default Constructor");
        System.out.println("Your Aadhar is ready");

        //Fetch ata from SQL
        //Read data from CSv ,XLSx
        //Open a file and read data
        // anything we do before
    }

    void  cry() {
        System.out.println("Cry");
    }

void sleep() {
        System.out.println("sleep");
    }

    void eat() {
        System.out.println("Eat");
    }
}

