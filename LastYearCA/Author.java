package LastYearCA;

public class Author {

    private int authorID;
    private int authorNumber;
    private String firstname;
    private String surname;


    public Author(int authorID, int authorNumber, String firstname, String surname)
    {
        this.authorID = authorID;
        this.authorNumber = authorNumber;
        this.firstname = firstname;
        this.surname = surname;
    }


    public int getAuthorID() {return authorID;}

    public void setAuthorID(int authorID) {this.authorID = authorID;}

    public int getAuthorNumber() {return authorNumber;}

    public void setAuthorNumber(int authorNumber) {this.authorNumber = authorNumber;}

    public String getFirstname() {return firstname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    @Override
    public String toString() {
        return "Author{" +
                "authorID=" + authorID +
                ", authorNumber=" + authorNumber +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
