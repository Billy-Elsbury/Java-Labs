package ConstructorsRevision;

public class TestBook {
    public static void main(String[] args) {

        Book book1 = new Book("Amazing Book","Billy",140,"English");

        Book book2 = new Book("Second Book","James",1320,"English");

        System.out.println(book2.pages);
        System.out.println(book1.pages);

    }
}
