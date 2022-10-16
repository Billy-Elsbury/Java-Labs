package ClassesAndObjectsRevision;

public class TestBook {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "Amazing Book";
        book1.pages = 140;
        book1.author = "Billy";
        book1.language = "English";

        Book book2 = new Book();

        book2.title = "Second Book";
        book2.pages = 1320;
        book2.author = "James";
        book2.language = "English";

        System.out.println(book2.pages);
    }
}
