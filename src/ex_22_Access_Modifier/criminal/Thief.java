package ex_22_Access_Modifier.criminal;

import ex_22_Access_Modifier.police.Cop;

public class Thief {

    public static void main(String[] args) {
        Cop thief=new Cop(100);
        thief.gun=100;
      thief.canIShoot();


    }
}
