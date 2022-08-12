
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int recommendAge = Integer.valueOf(scanner.nextLine());
            bookList.add(name, recommendAge);
        }

        System.out.println(bookList.size() + " books in total.");

        System.out.println();

        bookList.printBooks();
    }

}
