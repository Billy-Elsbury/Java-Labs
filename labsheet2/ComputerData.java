package labsheet2;

import javax.swing.*;
import java.lang.*;

public class ComputerData {

    String serial = JOptionPane.showInputDialog(null,"Please " +
            "enter the serial number of the computer (<CR> to exit)");
    if(serial.equals())
    {
        JOptionPane.showInputDialog(null,"Please " +
                "re-enter the serial number of the computer (<CR> to exit)");
    }

    String disk = JOptionPane.showInputDialog(null,"Please " +
            "enter the hard-disk space");

    String processor = JOptionPane.showInputDialog(null,"Please " +
            "enter the processor type");
}
