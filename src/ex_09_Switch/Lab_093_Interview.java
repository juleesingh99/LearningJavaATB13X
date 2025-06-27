package ex_09_Switch;

public class Lab_093_Interview {
    public static void main(String[] args) {
        char ch='A';
        switch (ch)
        {
            case 65:
                System.out.println("match ASCII"); // Character is also integer
                System.out.println("match ASCII"); // Character is also integer
                
                break;
                
            default:
                System.out.println("no match");
        }
    }
}
