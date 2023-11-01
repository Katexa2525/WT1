package task15;

import org.example.task15.Book;

import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

public class MainTest {

    @Test
    public void testBookSortingByISBN() {
        {
            Book[] myArray = {new Book("CCCC", "ggg",30, "60"), new Book("Anoggg", "ffff",15,"40"),
                              new Book("New title", "hhgh",60,"70")};
            Book[] result = {new Book("Anoggg", "ffff",15,"40"), new Book("CCCC", "ggg",30, "60"),
                             new Book("New title", "hhgh",60,"70")};
            Arrays.sort(myArray);
            Assert.assertArrayEquals(result, myArray);
        }
    }
}
