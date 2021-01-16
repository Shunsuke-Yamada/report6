package jp.ac.uryukyu.ie.e205719;

import java.util.Scanner;

public class Input {

    /**
     * プレイヤーがキーボードからジャンケンの手を入力するメソッド
     * @return
     */
    public String playerInPut(){
        System.out.println("出したい手を入力してください");
        System.out.println("「グー」or「チョキ」or「パー」");
        Scanner scan = new Scanner(System.in);
        Judge judge = new Judge();
        String str = scan.next();
        return str;
    }

}
