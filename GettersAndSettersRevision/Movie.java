package GettersAndSettersRevision;

/*This class sets the constructor Movie and Encapsulates
the data to make it private or in other words only accessible
by the constructor and hidden to the driver*/

//the set method sets the value of a private variable
//The get method returns the variable value

public class Movie {
    /*Setting the Movie parameters to private,
    so they cannot be changed in the driver class*/
    private String title;
    private String director;
    private String rating;

    //Setting the Movie class parameters/details
    public Movie(String title, String director, String rating){
        this.setTitle(title);
        this.setDirector(director);
        this.setRating(rating);
    }
    //making the method SetRating and checking to ensure it is valid
    public void setRating(String rating) {

        if(rating.equals("G") ||
                rating.equals("PG") || rating.equals("PG-13") ||
                rating.equals("R") || rating.equals("NR"))
        {
            this.rating = rating;
        }
        //If the setRating is not valid return "NR" or Not Rated.
        else{
            this.rating = "NR";
        }
    }
    /*making a getRating method to return the rating and make
    it accessible to the TestMove driver class*/
    public String getRating() {
        return rating;
    }

    //Repeating the set and get steps for the title and director.
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }


    public void setDirector(String director){
        this.director = director;
    }
    public String getDirector() {
        return director;
    }
}
