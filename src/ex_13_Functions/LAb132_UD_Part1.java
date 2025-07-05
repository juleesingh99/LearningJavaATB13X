package ex_13_Functions;

public class LAb132_UD_Part1 {
    public static void main(String[] args) {
wp_wr_greet();
greet_with_heloo();
greet_withDetails("Avyaan",1,987658.0);
    }
    //1.without parameter, without return type
    static void wp_wr_greet()
    {
        System.out.println("hello");
    }
    //2 without parameter, return tyoe
    static String greet_with_heloo()
    {
        System.out.println("wp with RT");
        return "How r u";
    }
    //3. with parametres no return type
    static void greet_withDetails(String name, int age, double salry)
    {
        System.out.println("your Name" + name);
        System.out.println("your age" + age);
        System.out.println("Salary" +salry);
    }
    ////4. with parametres  return type
    static int sum_of_two_numbers(int a, int b)
    {
        return a+b;
    }
}
