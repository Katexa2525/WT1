package org.example.task13;

import org.example.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    // Переопределение метода equals() для сравнения объектов ProgrammerBook
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        ProgrammerBook other = (ProgrammerBook) obj;
        return level == other.level && language.equals(other.language);
    }

    // Переопределение метода hashCode() для хэширования объектов ProgrammerBook
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + level;
        return result;
    }

    // Переопределение метода toString() для представления объекта в виде строки
    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language='" + language + '\'' +
                ", level=" + level +
                '}';
    }

    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("Clean Code", "Robert C. Martin", 30, "Java", 3);
        ProgrammerBook book2 = new ProgrammerBook("Code Complete", "Steve McConnell", 25, "C++", 2);

        System.out.println(book1.equals(book2)); // Сравнение объектов
        System.out.println(book1.hashCode()); // Получение хэш-кода
        System.out.println(book2.hashCode());
        System.out.println(book1); // Преобразование в строку
    }
}

