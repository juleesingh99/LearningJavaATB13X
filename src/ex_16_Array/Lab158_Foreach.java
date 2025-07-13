package ex_16_Array;

public class Lab158_Foreach {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }

        for(Object o: args)// Object is parent class of all, so we gave Object as we are not sure what value are there in CLI(Command line input
        {
            System.out.println(o);
        }


    }
}
