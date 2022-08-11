import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ExploringMaps {

    public static void main(String[] args) {

        Map<String, Book> books = new HashMap<>();
        books.put("Uncharted" , new Book("Uncharted", "Tom Holland", 199));
        books.put("Fantastic", new Book("Fantastic Beasts", "Eddie Redmayne", 499));
        books.put("Lost", new Book("The Lost City", "Sandra Bullock", 349));

        Book book1 = books.get("Fantastic");
        System.out.println(book1);

        System.out.println(books.keySet());
        System.out.println(books.values());

        Map<Book, BigDecimal> pricesMap;
    }
}
