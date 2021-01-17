package jp.ac.uryukyu.ie.e205719;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.TestFactory;

public class JudgeTest {
    @Test
    void judgeTest(){
        Judge judge = new Judge();
        String expected = "勝ち";
        String playerhand = "グー";
        String enemyhand = "チョキ";
        assertEquals(expected,judge.judge(playerhand, enemyhand));
    }
}
