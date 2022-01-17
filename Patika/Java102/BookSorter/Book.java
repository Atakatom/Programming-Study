
import java.util.Calendar;

public class Book implements Comparable<Book> {
    private String name;
    private int numberOfPages;
    private String author;
    private Calendar publishDate;

    public Book(String name, int numberOfPages, String author, Calendar publishDate) {
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

    public Calendar getPublishDate() {
        return this.publishDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.name.compareTo(otherBook.getName());
    }

    @Override
    public String toString() {
        return this.name + " " + this.numberOfPages;
    }
}
