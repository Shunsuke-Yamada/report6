package jp.ac.uryukyu.ie.e205719;

public class Fight {

    /**
     * ジャンケンを行う動作するメソッド
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
        System.out.println("終わり");
    }    
}
