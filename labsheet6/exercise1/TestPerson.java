package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args)
    {
        String output = "";
        String firstName,lastName;

        Person result1 = new Person();

        output += "Results of the first Person object are: \n\n" + result1;

        firstName = JOptionPane.showInputDialog("Please enter the first name of the second person");
        lastName = JOptionPane.showInputDialog("Please enter the last name of the second person");

        Person result2 = new Person(firstName, lastName);

        output += "\n\nResults of the second Person object are: \n\n" + result2;


        JOptionPane.showMessageDialog(null,output,"Person Class Tester",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}