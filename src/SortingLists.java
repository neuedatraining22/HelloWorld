import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        books.add(new Book("Fantastic Beasts", "Eddie Redmayne", 499));
        books.add(new Book("Fantastic Beasts", "Eddie Redmayne", 499));
        books.add(new Book("The Lost City", "Sandra Bullock", 349));

        Collections.sort(books);
        System.out.println(books);

        System.out.println(books.get(0));

        List<Book> longerBooks = books.stream()
                .distinct()
                .filter((b) -> {
                            return b.getNumberOfPages()>200;
                        })
                .filter( b -> b.getNumberOfPages()>200)
                .collect(Collectors.toList());

        System.out.println("Longer books");
        System.out.println(longerBooks);

        List<Integer> pages = books.stream().map( b ->b.getNumberOfPages()).collect(Collectors.toList());
        Long numberOfItems = pages.stream().count();

        books.stream().forEach(b -> System.out.println(b));

        //filter number of pages > 200
        /*
        public boolean isBookLengthGreaterThan200(Book b) {
            return b.getNumberOfPages() > 200
        }
         */
    }
}
