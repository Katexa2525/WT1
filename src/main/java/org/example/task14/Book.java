package org.example.task14;

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

    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 20);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 15);

        Book original = new Book("The Catcher in the Rye", "J.D. Salinger", 20);
        Book cloned = (Book) original.clone();
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);

        System.out.println(book1.equals(book2)); // Сравнение объектов
        System.out.println(book1.hashCode()); // Получение хэш-кода
        System.out.println(book2.hashCode());
        System.out.println(book1); // Преобразование в строку
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
    public Book clone()
    {
        Book book = new Book(this.title, this.author, this.price);
        return book;
    }
}


