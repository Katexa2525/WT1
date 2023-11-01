package org.example.task16;

import org.example.task16.Book;
import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book obj1, Book obj2) {
        return obj1.getAuthor().compareTo(obj2.getAuthor());
    }
}