package ArraysRevision;

import javax.swing.*;
import java.util.Arrays;

public class ArrayInitializer {

    public static void main(String[] args) {

        int[] testArray ={2,4,5,7,9};

        String userInputAsString;

        userInputAsString = JOptionPane.showInputDialog(null,
                "The array contains the numbers " + Arrays.toString(testArray) +
                " Please enter the position in the array you would like to view");



        if(isNumeric(userInputAsString)) {
            int userInput = Integer.parseInt(userInputAsString);

            if (userInput >= 0 && userInput <= 5){

                JOptionPane.showMessageDialog(null,
                        "The number in position " + userInput
                                + " of the array is: " + testArray[userInput - 1]);
            }
        }
        else JOptionPane.showMessageDialog(null,
                "Error, Please enter a valid number between 1 and 5");
    }

    private static boolean isNumeric(String userInputAsString) {
        return userInputAsString !=
                null && userInputAsString.matches("[-+]?\\d*\\.?\\d+");
    }
}
