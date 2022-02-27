import java.util.Comparator;

public class PageNumberComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getNumOfPages() > b2.getNumOfPages())
            return 1;
        else if (b1.getNumOfPages() < b2.getNumOfPages())
            return -1;
        return 0;
    }
}
