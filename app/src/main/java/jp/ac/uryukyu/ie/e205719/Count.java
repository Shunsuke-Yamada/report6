package jp.ac.uryukyu.ie.e205719;

public class Count {

    private int count_win;
    private int count_lose;
    private int count_draw;
    
    /**
     * ジャンケンの勝ちの数をカウントするメソッド
     */
    public void countWin(){
        setCountWin(this.count_win + 1);
        System.out.println(getCountWin());
    }

    /**
     * ジャンケンの敗けの数をカウントするメソッド
     */
    public void countLose(){
        setCountLose(this.count_lose + 1);
        System.out.println(getCountLose());
    }

    /**
     * ジャンケンの引き分けの数をカウントするメソッド
     */
    public void countDraw(){
        setCountDraw(this.count_draw + 1);
        System.out.println(getCountDraw());
    }

    public int getCountWin(){ return count_win; }
    public int getCountLose(){ return count_lose; }
    public int getCountDraw(){ return count_draw; }
    public void setCountWin(int count_win){ this.count_win = count_win; }
    public void setCountLose(int count_lose){ this.count_lose = count_lose; }
    public void setCountDraw(int count_draw){ this.count_draw = count_draw; }
}
