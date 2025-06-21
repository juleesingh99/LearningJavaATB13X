package ex_04_Typecasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course =100;
        float GST =18.45f;
        int total= (int) (course+GST); // data loss is here. so we should consider datatype accordingly
        float total1= course+GST;
        System.out.println(total);
        System.out.println(total1);
    }
}
