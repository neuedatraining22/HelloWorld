import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingLists {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sonya");
        names.add("Duane");
        names.add("Anna");
        names.add("Kenny");
        names.add("Kaveri");

        Collections.sort(names);
        System.out.println(names);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Uncharted", "Tom Holland", 199));
        books.add(new Book("Fantastic Beasts", "Eddie Redmayne", 499));
        books.add(new Book("The Lost City", "Sandra Bullock", 349));

        Collections.sort(books);
        System.out.println(books);
    }
}
