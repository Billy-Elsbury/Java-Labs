package labsheet7.Exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726, "Tommy", "Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student[] ComputingStudents = new Student[10];
        ComputingStudents[0] = student1;
        ComputingStudents[1] = student2;

        Student[] CreativeMediaStudents = new Student[10];
        CreativeMediaStudents[0] = student3;
        CreativeMediaStudents[1] = student4;

        Department Computing = new Department("Computing Students", ComputingStudents);
        Department CreativeMedia = new Department("Creative Media Students", CreativeMediaStudents);

        Department[] Departments = new Department[5];
        Departments[0] = Computing;
        Departments[1] = CreativeMedia;

        Institute institute = new Institute("Institute of Technology, Tralee",Departments);

        System.out.println(institute);
        System.out.println("Total Students " + institute.getTotalStudents());
    }
}
