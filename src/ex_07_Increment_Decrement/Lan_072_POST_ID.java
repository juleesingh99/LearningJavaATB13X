package ex_07_Increment_Decrement;

public class Lan_072_POST_ID {


    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);
        System.out.println(a);

        // 7 /a=10
        //8 / a=11

        //Post increment - print first and increment
        int a_post =10;
        System.out.println(a_post++);
        System.out.println(a_post);

        // 15 / a_post=10
        // 16/ a_post 10
        //17/ a_post 11
    }

    public static class Lab_077_DE {
        public static void main(String[] args) {
            int a= 10;
            int res =a--;
            System.out.println(res); // 10
            System.out.println(a);//9
            //System.out.println(--a);

        }
    }
}
