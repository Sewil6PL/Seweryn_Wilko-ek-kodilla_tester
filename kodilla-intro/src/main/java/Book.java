public class Book {
    private String author;
    private String title;


    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }


    public static Book of(String author, String title) {

        return new Book(author, title);
    }

    public String getAuthor() {

        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public String getTitle() {

        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        Object o;
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
class TestApp5{
    public static void main(String[] args) {
        Book b1 = Book.of("Jan Kowalski", "Swiat");
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1);
    }
}