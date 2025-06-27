package ex_09_Switch;

public class Lab_097_JDK13 {
    public static void main(String[] args) {
        //multiple match
        int item=006;
        switch (item)
        {
            case 001, 002, 005:
                System.out.println("electronic Gadgets");
                break;
            case 003, 004, 006:
                System.out.println("mech gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
