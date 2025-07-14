package ex_17_OOPs;

public class Lab167_OOPs_2 {
    public static void main(String[] args) {
        Student s1= new Student();// // This also creates a new object and calls constructor
        Student s2;// only reference, no object creation
        new Student(); // This also creates a new object and calls constructor, No reference
    }

}

class Student{
    String name;

    //Default Constructor, same as class name
    Student()
    {
        System.out.println("Default Constructor");
    }

}


