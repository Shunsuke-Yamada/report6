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

    /**
     * ルール説明を出力するメソッド
     */
    public void ruleExplanation(){
        System.out.printf("ルール説明\n「グー」or「チョキ」or「パー」or「END」を出すことができます。\n「END」を入力するとジャンケンを終わらせることができます。\n");
    }

    /**
     * 戦績を出力するメソッド
     */
    public void result(){
        System.out.println("あなたの戦績は０勝０負０引き分け(仮)です。");
    }
}