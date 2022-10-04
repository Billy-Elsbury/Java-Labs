package labsheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main (String args[])
    {
        int temperature;
        String temperatureAsString;

        String text;

        text = "Calling the single-argument constructor: " +
                "setting the temperature of first thermometer to 35C\n";

        Thermometer firstThermometer = new Thermometer(35);

        text += "\nFirst Thermometer... \n\n" + firstThermometer;

        text += "\nCalling the no-argument constructor: " +
                "setting the temperature of second thermometer to 0C\n";

        Thermometer secondThermometer = new Thermometer();

        text += "\nSecond Thermometer... \n\n" + secondThermometer;

        text += "\nCalling setTemperature()....." +
                "setting the temperature of second thermometer to 25C\n";


        secondThermometer.setTemperature(25);

        text += "\nSecond Thermometer... \n\n" + secondThermometer;

        JOptionPane.showMessageDialog(null,"Thermometer Testing Program\n\n" + text,"",1);


        temperatureAsString = JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer in Celsius: ");

        temperature = Integer.parseInt(temperatureAsString);

        text = "Calling setTemperature()....." +
                "setting the temperature of first thermometer to " + temperature + "C";
        firstThermometer.setTemperature(temperature);

        text += "\nFirst Thermometer Details... \n\n"+ firstThermometer;

        JOptionPane.showMessageDialog(null,"Thermometer Testing Program output\n\n" + text,"",1);

//-----

        temperatureAsString = JOptionPane.showInputDialog("Please enter the current temperature of the second thermometer in Celsius: ");

        temperature = Integer.parseInt(temperatureAsString);

        text = "Calling setTemperature()....." +
                "setting the temperature of second thermometer to " + temperature + "C";
        firstThermometer.setTemperature(temperature);

        text += "\nSecond Thermometer Details... \n\n"+ firstThermometer;

        JOptionPane.showMessageDialog(null,"Thermometer Testing Program output #2\n\n" + text,"",1);
    }
}