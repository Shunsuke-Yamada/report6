package jp.ac.uryukyu.ie.e205719;

import java.util.Random;

public class Enemy {
    
        /**
     * 敵の手をランダムで出すメソッド
     * @return　enemyhand 敵の出した手
     */
    public String enemyInPut(){
        String[] hands = { "グー", "チョキ", "パー" };
        Random r = new Random();
        String enemyhand = hands[r.nextInt(3)];
        return enemyhand;
    }
}
