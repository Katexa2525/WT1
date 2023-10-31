package task1;

import org.example.task1.Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    double x;
    double y;
    double delta;
    @Before
    public void setUp(){
        x = 4;
        y = 2.5;
        delta = 0.000001;
    }

    @Test
    public void testCalculate()
    {
        double result = 4.17671227012837;
        Assert.assertEquals(result, Main.calculate(x, y), delta); //assertArrayEquals
    }
}
