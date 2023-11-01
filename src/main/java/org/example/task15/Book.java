package org.example.task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        Book book1 = new Book("AAAAAAAAA", "han", 20, "12");
        Book book2 = new Book("vvvvvvvvv", "hyon", 15, "10");
        Book book3 = new Book("ccccccccc", "tomas", 18, "77");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Переопределение метода equals() для сравнения объектов Book
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return price == other.price &&
                title.equals(other.title) &&
                author.equals(other.author);
    }

    // Переопределение метода hashCode() для хэширования объектов Book
    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + price;
        return result;
    }

    // Переопределение метода toString() для представления объекта в виде строки
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int compareTo(Book other) {
        return this.isbn.compareTo(other.isbn);
    }
}

