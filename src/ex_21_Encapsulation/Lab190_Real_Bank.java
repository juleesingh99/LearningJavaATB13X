package ex_21_Encapsulation;

public class Lab190_Real_Bank {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank("Julee", 1000);
        long bal=iciciBank.getBal();
        System.out.println(bal);
//        iciciBank.setBal(2000, false);
//        long bal2= iciciBank.getBal();
//        System.out.println(bal2);
        iciciBank.setBal(2000, true);
        long bal3= iciciBank.getBal();
        System.out.println(bal3);




    }

}

class ICICIBank
{
    private String name;
    private long bal;


    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isChashier)
    {
        if (isChashier==true) {
            this.bal = bal;
        }
        else {
            System.out.println("you are not allowed to set");
        }
        }
    }
