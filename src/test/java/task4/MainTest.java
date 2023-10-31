package task4;

import org.example.task4.Main;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void testIsNumberPrimeWithPrimeNumber() {
        assertTrue(Main.isNumberPrime(17));
    }

    @Test
    public void testIsNumberPrimeWithNonPrimeNumber() {
        assertFalse(Main.isNumberPrime(4));
    }

    @Test
    public void testFindPrimeElements() {
        int[] numbers = {1, 2, 4, 7, 10};
        boolean[] expected = {false, true, false, true, false};
        assertArrayEquals(expected, Main.findPrimeElements(numbers));
    }
}
