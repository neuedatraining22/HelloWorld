import java.util.Objects;

public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public int compareTo(Book o) {
       // return title.compareTo(o.getTitle());
        return - Integer.compare(numberOfPages, o.getNumberOfPages());
    }

    @Override
    public String toString() {

        return "Book\r\n  \" " +
                "title='" + title + '\'' + System.lineSeparator() +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '\"';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, numberOfPages);
    }
}
