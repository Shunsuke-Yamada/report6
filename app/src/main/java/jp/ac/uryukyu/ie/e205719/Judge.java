package jp.ac.uryukyu.ie.e205719;

public class Judge {
    Count count = new Count();
    /**
     * ジャンケンの勝敗を判定するメソッド
     */
    public void judge(String playerhand, String enemyhand){
        if(playerhand.equals("グー") && enemyhand.equals("グー")){
            System.out.println("引き分け");
            count.countDraw();
        }
        else if(playerhand.equals("グー") && enemyhand.equals("チョキ")){
            System.out.println("勝ち");
            count.countWin();
        }
        else if(playerhand.equals("グー") && enemyhand.equals("パー")){
            System.out.println("負け");
            count.countLose();
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("グー")){
            System.out.println("負け");
            count.countLose();
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("チョキ")){
            System.out.println("引き分け");
            count.countDraw();
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("パー")){
            System.out.println("勝ち");
            count.countWin();
        }
        else if(playerhand.equals("パー") && enemyhand.equals("グー")){
            System.out.println("勝ち");
            count.countWin();
        }
        else if(playerhand.equals("パー") && enemyhand.equals("チョキ")){
            System.out.println("負け");
            count.countLose();
        }
        else if(playerhand.equals("パー") && enemyhand.equals("パー")){
            System.out.println("引き分け");
            count.countDraw();
        }
    }
}