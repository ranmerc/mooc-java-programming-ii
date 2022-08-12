import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookList {

    private ArrayList<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public void add(String name, int recommendAge) {
        books.add(new Book(name, recommendAge));
    }

    public int size() {
        return books.size();
    }

    public void printBooks() {
        Comparator<Book> printComparator = Comparator
                .comparing(Book::getRecommendAge)
                .thenComparing(Book::getName);

        Collections.sort(books, printComparator);

        books.forEach(System.out::println);
    }
}
