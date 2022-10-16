package GettersAndSettersRevision;

public class TestMovie {
    public static void main(String[] args) {
        Movie movie1= new Movie("The Avengers", "Joss Whedon", "Test1");
        Movie movie2= new Movie("Step Brothers", "Adam Mckay", "Test2");

        movie1.setRating("PG-13");
        movie2.setRating("TestError2");

        System.out.println("The title of Movie 1 is: " + movie1.getTitle());
        System.out.println("The director of Movie 1 is: " + movie1.getDirector());
        System.out.println("The rating of Movie 1 is: " + movie1.getRating());
        System.out.println("The title of Movie 2 is: " + movie2.getTitle());
        System.out.println("The director of Movie 2 is: " + movie2.getDirector());
        System.out.println("The rating of Movie 2 is: " + movie2.getRating());

    }
}
