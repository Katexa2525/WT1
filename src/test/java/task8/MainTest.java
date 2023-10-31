package task8;

import org.example.task8.Main;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class MainTest {
    @Test
    public void testFindInsertPositions() {
        double[] sequenceA = {1, 3, 5, 7, 9};
        double[] sequenceB = {2, 4, 6, 8, 10};
        List<Integer> expectedInsertPositions = List.of(1, 2, 3, 4, 5);

        List<Integer> insertPositions = Main.findInsertPositions(sequenceA, sequenceB);
        Assert.assertEquals(expectedInsertPositions, insertPositions);
    }
}

