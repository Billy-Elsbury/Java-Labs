package ArraysRevision;

import javax.swing.*;
import java.util.Arrays;

public class ArrayInitializer {

    public static void main(String[] args) {

        int[] testArray ={2,4,5,7,9};

        String userInputAsString;

        //Read in user input as String (JOptionPane only reads in Strings)
        userInputAsString = JOptionPane.showInputDialog(null,
                "The array contains the numbers " + Arrays.toString(testArray) +
                " Please enter the position in the array you would like to view");


        //Call method to test if userInput as a String is an Int
        if(isNumeric(userInputAsString)) {
            //If userInput is a valid Int, parse the String to an Int
            int userInput = Integer.parseInt(userInputAsString);

            //Check to see if userInput is between the boundaries of the array
            if (userInput >= 0 && userInput <= 5){

                JOptionPane.showMessageDialog(null,
                        "The number in position " + userInput
                                + " of the array is: " + testArray[userInput - 1]);
            }
        }
        else JOptionPane.showMessageDialog(null,
                "Error, Please enter a valid number between 1 and 5");
    }

    //Method to test if userInput is a valid Int before parsing as an Int, to avoid errors.
    private static boolean isNumeric(String userInputAsString) {
        return userInputAsString !=
                null && userInputAsString.matches("[-+]?\\d*\\.?\\d+");
    }
}
