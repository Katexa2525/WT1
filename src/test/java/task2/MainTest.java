package task2;

import org.example.task2.Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    int x;
    int y;
    @Before
    public void setUp(){
        x = 3;
        y = 0;
    }

    @Test
    public void testIsInside()
    {
        boolean result = true;
        Assert.assertEquals(result, Main.isInside(x, y));
    }
}
