package task9;

import org.example.task9.Ball;

import org.junit.Assert;
import org.junit.Test;

public class BallTest {
    @Test
    public void testBallWeight() {
        Ball ball = new Ball(0.5, "red");
        Assert.assertEquals(0.5, ball.getWeight(), 0.001);
    }

    @Test
    public void testBallColor() {
        Ball ball = new Ball(0.5, "blue");
        Assert.assertEquals("blue", ball.getColor());
    }
}