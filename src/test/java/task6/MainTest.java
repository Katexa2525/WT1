package task6;

import org.example.task6.Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    double[] myArray;
    @Before
    public void setUp(){
        myArray = new double[] {8.5, 10, 12, 14.5, 15, 16, 20, 25};
    }

    @Test
    public void testGetMatrix() {
        String result = """
                8.5 10.0 12.0 14.5 15.0 16.0 20.0 25.0\s
                10.0 12.0 14.5 15.0 16.0 20.0 25.0 8.5\s
                12.0 14.5 15.0 16.0 20.0 25.0 8.5 10.0\s
                14.5 15.0 16.0 20.0 25.0 8.5 10.0 12.0\s
                15.0 16.0 20.0 25.0 8.5 10.0 12.0 14.5\s
                16.0 20.0 25.0 8.5 10.0 12.0 14.5 15.0\s
                20.0 25.0 8.5 10.0 12.0 14.5 15.0 16.0\s
                25.0 8.5 10.0 12.0 14.5 15.0 16.0 20.0 \n""";
        Assert.assertEquals(result, Main.getMatrix(myArray));
    }
}
