package Patika.Java102.BookSorter;

import java.util.Date;

public class BookApp {
    public static void main(String[] args) {
        Book b1 = new Book("Ben, Kirke", 400, "Madeline Miller", new Date(2021, 01, 25));
        System.out.println(b1.getPublishDate().getDate());
    }
}
