package ex_09_Switch;

public class Task_Triangleclassification {
    public static void main(String[] args) {
        int s1 =Integer.parseInt(args[0]);
        int s2=Integer.parseInt(args[1]);
        int s3=Integer.parseInt(args[2]);


        //int side=Integer.parseInt(args[]);
        if(s1==s2 && s2==s3)
        {
            System.out.println("equilateral Triangle");
        }
        else if (s1==s2 || s2==s3 || s3==s1)
        {
            System.out.println("isosceles triangle");


        }
else
            System.out.println("scalene ");
    }
}
