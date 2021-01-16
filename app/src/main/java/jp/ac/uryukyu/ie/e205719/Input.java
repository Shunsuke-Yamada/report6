package jp.ac.uryukyu.ie.e205719;

import java.util.Scanner;

public class Input {

    /**
     * プレイヤーがキーボードからジャンケンの手を入力するメソッド
     * @return playerhand プレイヤーが出した手
     */
    public String playerInPut(){
        System.out.println("出したい手を入力してください");
        Scanner scan = new Scanner(System.in);
        Judge judge = new Judge();
        String playerhand = scan.next();
        return playerhand;
    }

}
