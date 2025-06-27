package ex_07_Userinput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {
String age_string = args[0];
        int age= Integer.parseInt(age_string);
        System.out.println("Age: " + age);
        String vote= age >= 18 ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(vote);
    }
}
