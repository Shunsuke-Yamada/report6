package jp.ac.uryukyu.ie.e205719;

public class Output{

    /**
     * プレイヤーが出した手を出力するメソッド
     * @param playerhand　プレイヤーの出した手
     */
    public void playerOutPut(String playerhand){
        System.out.println("あなたの手は「" + playerhand + "」です。");
    }

    /**
     * 敵が出した手を出力するメソッド
     * @param enemyhand　敵の出した手
     */
    public void enemyOutPut(String enemyhand){
        System.out.println("相手の手は「" + enemyhand + "」です。");
    }
}