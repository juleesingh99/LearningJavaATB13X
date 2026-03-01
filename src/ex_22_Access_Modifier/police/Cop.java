package ex_22_Access_Modifier.police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int bullet)
    {
        this.gun=bullet;
    }
    public void canIShoot()
    {
        System.out.println("yes you can!!");
    }
}
