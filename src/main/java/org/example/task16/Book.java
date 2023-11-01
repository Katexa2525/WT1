package org.example.task16;

import java.util.*;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }
    public static void main(String[] args) {
        Book[] myArray = {  new Book("AAA", "MinGva", 7),
                new Book("CCC", "KimDan", 2),
                new Book("QQQ", "Kate", 5)};

        Comparator<Book> titleComparator = new TitleComparator();
        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> authorTitlePriceComparator = new AuthorComparator().thenComparing(new TitleComparator().thenComparing(new PriceComparator()));

        Arrays.sort(myArray, titleComparator);
        System.out.println(Arrays.toString(myArray));
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
}