package Patika.Java102.BookSorter;

import java.util.Date;

public class Book implements Comparable<Book> {
    private String name;
    private int numberOfPages;
    private String author;
    private Date publishDate;

    public Book(String name, int numberOfPages, String author, Date publishDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getName() {
        return this.name;
    }

    public int getNumOfPages() {
        return this.numberOfPages;
    }

    public String getAuthor() {
        return this.author;
    }

    public Date getPublishDate() {
        return this.publishDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.name.compareTo(otherBook.getName());
    }
}
