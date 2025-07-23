package ex_22_Access_Modifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop=new Cop(5);
        jrCop.gun=5;
        jrCop.canIShoot();
    }
}
