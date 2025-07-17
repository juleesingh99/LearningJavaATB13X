package ex_19_Inheritance.single_inheritance;

public class Lab181_real_SI {
    public static void main(String[] args) {
TestCase1 t1=new TestCase1();
t1.runningTC1();

TestCase2 t2=new TestCase2();
t2.runningTC2();

CommonToAll c1= new CommonToAll();
TestCase1 t3=new TestCase1();
//Dynamic Dispatch
CommonToAll c2=new TestCase1();// Father reference can be present with Son's object created
        //Father is present when SON is being born
       // TestCase1 t3=new CommonToAll(); child reference with father object not possible. Child can not be present when Father is born
  c2.closeBrowser();

    }








}
