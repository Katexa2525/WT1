package task7;

import org.example.task7.Main;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testBubbleSort() {
        double[] input = {5.1, 10, 6, 12.5, 3, 24, 7, 8};
        double[] expected = {3, 5.1, 6, 7, 8, 10, 12.5, 24};

        double[] result = Main.bubbleSort(input);
        Assert.assertArrayEquals(expected, result, 0.001);
    }
}
