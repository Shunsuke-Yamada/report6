package jp.ac.uryukyu.ie.e205719;

public class Judge {

    public void judge(String playerhand, String enemyhand){

        if(playerhand.equals("グー") && enemyhand.equals("グー")){
            System.out.println("Draw");
        }
        else if(playerhand.equals("グー") && enemyhand.equals("チョキ")){
            System.out.println("player Win");
        }
        else if(playerhand.equals("グー") && enemyhand.equals("パー")){
            System.out.println("enemy Win");
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("グー")){
            System.out.println("enemy Win");
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("チョキ")){
            System.out.println("Draw");
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("パー")){
            System.out.println("player Win");
        }
        else if(playerhand.equals("パー") && enemyhand.equals("グー")){
            System.out.println("player Win");
        }
        else if(playerhand.equals("パー") && enemyhand.equals("チョキ")){
            System.out.println("enemy Win");
        }
        else if(playerhand.equals("パー") && enemyhand.equals("パー")){
            System.out.println("Draw");
        }
        else{
            System.out.println("判定不可");
        }
    }

}
    
