import javax.swing.*;

public class Alvarez_Derek_Lab7_Telephone {
    //************************************************************
// Telephone.java
//
// Uses the TelephonePanel class to create a (functionless) GUI
// like a telephone keypad with a title.
// Illustrates use of BorderLayout and GridLayout.
//***********************************************************
        public static void main(String[] args)
        {
            JFrame frame = new JFrame("Telephone");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new Alvarez_Derek_Lab7_TelephonePanel());
            frame.pack();
            frame.setVisible(true);
        }
    }


