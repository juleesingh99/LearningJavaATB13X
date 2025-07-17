package ex_21_Encapsulation;

public class Lab189_Ecap_demo {
    public static void main(String[] args) {
        VWOLogin vwoLogin =new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        GoodVWOLogin goodVWOLogin=new GoodVWOLogin("admin","Password");
       // System.out.println(goodVWOLogin.password); can not access private instance variable outside the class
        goodVWOLogin.setPassword("pass123");
        String pass=goodVWOLogin.getPassword();

        System.out.println(pass);



    }

}

class VWOLogin
{
   public  String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }



}

class GoodVWOLogin{
    private String username;
    private String password;

    //parameterized constructor
    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    }







