package ex_06_Ternary_Operator;

public class Lab067_TO_Real_Age_Classification {
    public static void main(String[] args) {
        //age= 65;
        int age =65;
        String result = age < 18 ? "minor": (age <65)? "adult": " Senior Citizen";
        System.out.println(result);
    }
}
;