package jp.ac.uryukyu.ie.e205719;

public class Judge {
    Count count = new Count();
    String str;
    /**
     * ジャンケンの勝敗を判定するメソッド
     */
    public String judge(String playerhand, String enemyhand){
        if(playerhand.equals("グー") && enemyhand.equals("グー")){
            count.countDraw();
            str = "引き分け";
        }
        else if(playerhand.equals("グー") && enemyhand.equals("チョキ")){
            count.countWin();
            str = "勝ち";
        }
        else if(playerhand.equals("グー") && enemyhand.equals("パー")){
            count.countLose();
            str = "負け";
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("グー")){
            count.countLose();
            str = "負け";
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("チョキ")){
            count.countDraw();
            str = "引き分け";
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("パー")){
            count.countWin();
            str = "勝ち";
        }
        else if(playerhand.equals("パー") && enemyhand.equals("グー")){
            count.countWin();
            str = "勝ち";
        }
        else if(playerhand.equals("パー") && enemyhand.equals("チョキ")){
            count.countLose();
            str = "負け";
        }
        else if(playerhand.equals("パー") && enemyhand.equals("パー")){
            count.countDraw();
            str = "引き分け";
        }
        return str;
    }
}