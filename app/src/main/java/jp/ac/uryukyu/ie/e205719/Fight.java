package jp.ac.uryukyu.ie.e205719;

public class Fight {

    /**
     * 実際にジャンケンの動きを行うメソッド
     * 何度もジャンケンを繰り返す。「END」を入力すると終了する。
     */
    public void fight(){
        String playerhand;
        String enemyhand;

        Input in = new Input();
        Output out = new Output();
        Enemy enemy  = new Enemy();
        Judge judge = new Judge();

        out.ruleExplanation();
        
        while(true){
            playerhand = in.playerInPut(); 
            enemyhand = enemy.enemyInPut();
                
            if(playerhand.equals("グー") || playerhand.equals("チョキ") || playerhand.equals("パー")){
                out.playerOutPut(playerhand);
                out.enemyOutPut(enemyhand);
                judge.judge(playerhand,enemyhand);
            }
            else if(playerhand.equals("END")){
                break;
            }
            else{
                System.out.printf("正しく入力してください\n再度入力をお願いします。\n");
            }
        }
        out.result();
        System.out.println("終わり");
    }    
}
