package task9;

import org.example.task9.Basket;
import org.example.task9.Ball;

import org.junit.Assert;
import org.junit.Test;

public class BasketTest {
    @Test
    public void testAddBall() {
        Basket basket = new Basket();
        Ball ball = new Ball(0.5, "red");
        basket.addBall(ball);
        Assert.assertEquals(0, basket.countBlueBalls());
    }

    @Test
    public void testTotalWeight() {
        Basket basket = new Basket();
        basket.addBall(new Ball(0.5, "red"));
        basket.addBall(new Ball(0.3, "blue"));
        basket.addBall(new Ball(0.8, "blue"));
        Assert.assertEquals(1.6, basket.getTotalWeight(), 0.001);
    }
}
