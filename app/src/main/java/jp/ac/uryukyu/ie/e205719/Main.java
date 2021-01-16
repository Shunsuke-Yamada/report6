package jp.ac.uryukyu.ie.e205719;

public class Main {
    public static void main(String[] ags){

        String playerhand;
        String enemyhand;

        Input in = new Input();
        Output out = new Output();
        Judge judge  = new Judge();

        playerhand = in.inPut(); 
        enemyhand = judge.enemy();

        out.playerOutPut(playerhand);
        out.enemyOutPut(enemyhand);
    }
}
