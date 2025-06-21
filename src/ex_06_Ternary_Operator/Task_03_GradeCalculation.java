package ex_06_Ternary_Operator;

public class Task_03_GradeCalculation {
    public static void main(String[] args) {
        //Grade Calculation Using Nested Ternary
        //
        //                   Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        // logic if marks >=90 then A+
        //marks >=75 && marks <90 then A
        //marks >=60 && marks <75 then B
        //marks >=40 && marks <60 then C
        //marks<40 then fail

        int marks=89;

        String result = marks >=90 ? "A+": (marks >=75 && marks<90?"A":(marks >=60 && marks <75 ?"B":(marks >=40 && marks <60?"C":"fail")));
        System.out.println(result);
    }
}
