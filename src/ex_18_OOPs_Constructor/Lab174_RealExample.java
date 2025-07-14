package ex_18_OOPs_Constructor;

public class Lab174_RealExample {
    public static void main(String[] args) {
        WebAutomation w1=new WebAutomation();
    }
}

class WebAutomation{

    WebAutomation()
    {
        System.out.println("read CSV file");
        System.out.println("Open Page before loading the scripts");
    }
}
