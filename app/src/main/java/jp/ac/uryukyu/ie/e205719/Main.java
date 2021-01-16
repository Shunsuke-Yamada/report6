package jp.ac.uryukyu.ie.e205719;

public class Main {
    public static void main(String[] ags){

        String playerhand;
        String enemyhand;

        Input in = new Input();
        Output out = new Output();
        Enemy enemy  = new Enemy();
        Judge judge = new Judge();

        playerhand = in.playerInPut(); 
        enemyhand = enemy.enemyInPut();

        out.playerOutPut(playerhand);
        out.enemyOutPut(enemyhand);

        judge.judge(playerhand,enemyhand);
    }
}
