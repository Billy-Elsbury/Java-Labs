package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
        String output = "";

        Person result1 = new Person();

        output += "Calling the no-argument Computer constructor. " +
                "The first Computer object details are: \n\n" + result1.toString();

        Person result2 = new Person("Dell","Laptop",3.25,16,550.99);


        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\n" + result2.toString();

        JOptionPane.showMessageDialog(null,output,"Person Class Tester",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}