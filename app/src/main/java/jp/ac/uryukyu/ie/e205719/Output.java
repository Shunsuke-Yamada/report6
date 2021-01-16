package jp.ac.uryukyu.ie.e205719;

public class Output{
    Count count = new Count();

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
     * 成績を出力するメソッド
     */
    public void result(){
        System.out.println("あなたの成績は" + count.getCountWin() + "勝" + count.getCountLose() + "負" + count.getCountDraw() + "引き分けです。");
    }
}