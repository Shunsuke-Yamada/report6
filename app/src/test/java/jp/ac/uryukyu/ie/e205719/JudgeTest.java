/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e205719;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void JudgeTest() {
        Judge judge = new Judge();
        String expected = "勝ち";
        String playerhand = "グー";
        String enemyhand = "チョキ";
        assertEquals(expected,judge.judge(playerhand, enemyhand));
    }
}

