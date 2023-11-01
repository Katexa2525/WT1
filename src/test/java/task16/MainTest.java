package task16;

import org.example.task16.Book;
import org.example.task16.TitleComparator;
import org.example.task16.AuthorComparator;
import org.example.task16.PriceComparator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class MainTest {

    @Test
    public void testTitleComparator() {
        Book[] myArray = {new Book("Dudka", "fff", 9),
                new Book("AAAAA", "Kurit", 3),
                new Book("CCCCC", "LOLOLOSHKA", 6)};

        Book[] result = {new Book("AAAAA", "Kurit", 3),
                new Book("CCCCC", "LOLOLOSHKA", 6),
                new Book("Dudka", "fff", 9)};

        Comparator<Book> titleComparator = new TitleComparator();
        Arrays.sort(myArray, titleComparator);

        Assert.assertArrayEquals(result, myArray);
    }

    @Test
    public void testTitleAuthorComparator() {
        Book[] myArray = {new Book("Sos", "FFF", 87),
                new Book("Sos", "AAA", 25),
                new Book("tuk", "Cringe", 2)};

        Book[] result = {new Book("Sos", "AAA", 25),
                new Book("Sos", "FFF", 87),
                new Book("tuk", "Cringe", 2)};

        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Arrays.sort(myArray, titleAuthorComparator);

        Assert.assertArrayEquals(result, myArray);
    }

    @Test
    public void testAuthorTitleComparator() {
        Book[] myArray = {new Book("Titty", "Author", 89),
                new Book("Anohin", "Anna", 84),
                new Book("New Castle", "Nananananiev", 13)};

        Book[] result = {new Book("Anohin", "Anna", 84),
                new Book("Titty", "Author", 89),
                new Book("New Castle", "Nananananiev", 13)};

        Comparator<Book> authorTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Arrays.sort(myArray, authorTitleComparator);

        Assert.assertArrayEquals(result, myArray);
    }

    @Test
    public void testAuthorTitlePriceComparator() {
        Book[] myArray = {new Book("Pic", "Bobr", 66),
                new Book("Pic", "Babr", 22),
                new Book("Nif", "rui", 34)};

        Book[] result = {new Book("Pic", "Babr", 22),
                new Book("Pic", "Bobr", 66),
                new Book("Nif", "rui", 34)};

        Comparator<Book> authorTitlePriceComparator = new AuthorComparator().thenComparing(new TitleComparator().thenComparing(new PriceComparator()));
        Arrays.sort(myArray, authorTitlePriceComparator);

        Assert.assertArrayEquals(result, myArray);
    }
}
