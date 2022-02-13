
import java.util.Calendar;
import java.util.TreeSet;

public class BookApp {
    public static void main(String[] args) {
        TreeSet<Book> bookShelfOrderedByPages = new TreeSet<>(new PageNumberComparator());
        TreeSet<Book> bookShelfOrderedByNames;
        Calendar publishDate = Calendar.getInstance();
        publishDate.set(2021, 1, 25);
        bookShelfOrderedByPages.add(new Book("Ben, Kirke", 400, "Madeline Miller", publishDate));
        publishDate.set(2021, 9, 28);
        bookShelfOrderedByPages.add(new Book("Simyaci", 184, "Paulo Coelho", publishDate));
        publishDate.set(2019, 10, 4);
        bookShelfOrderedByPages.add(new Book("Hayvan Ciftligi", 152, "George Orwell", publishDate));
        publishDate.set(2021, 1, 11);
        bookShelfOrderedByPages.add(new Book("Var misin?", 320, "Dogan Cuceoglu", publishDate));
        publishDate.set(2021, 5, 3);
        bookShelfOrderedByPages.add(new Book("Korluk", 336, "Jose Saramago", publishDate));
        System.out.println("*****Order of Books By Number of Pages*****\n");
        for (Book b : bookShelfOrderedByPages) {
            System.out.println(b);
        }
        bookShelfOrderedByNames = new TreeSet<>();
        bookShelfOrderedByNames.addAll(bookShelfOrderedByPages);
        System.out.println("\n*****Order of Books By Their Names*****\n");
        for (Book b : bookShelfOrderedByNames) {
            System.out.println(b);
        }

    }
}
