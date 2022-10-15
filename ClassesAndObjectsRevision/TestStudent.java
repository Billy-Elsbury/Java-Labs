package ClassesAndObjectsRevision;

public class TestStudent {
    public static void main(String[] args) {

        Student myStudent1 = new Student();
        myStudent1.firstName = "Billy";
        myStudent1.lastName = "Elsbury";
        myStudent1.major = "Business";
        myStudent1.gpa = 2.3;
        myStudent1.age = 20;
        myStudent1.onProbation = false;

        Student myStudent2 = new Student();
        myStudent2.firstName = "Pam";
        myStudent2.lastName = "Beasley";
        myStudent2.major = "Art";
        myStudent2.gpa = 2.5;
        myStudent2.age = 23;
        myStudent2.onProbation = true;

        System.out.println("The first name of the student is: "+ myStudent1.firstName);
    }
}
