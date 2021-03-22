import java.awt.*;
import javax.swing.*;

public class Alvarez_Derek_Lab7_TelephonePanel extends JPanel
{
public Alvarez_Derek_Lab7_TelephonePanel() {

    //set BorderLayout for this panel
    setLayout(new BorderLayout());

    //create a JLabel with "Your Telephone" title
    JLabel title = new JLabel("Your Telephone");

    //add title label to north of this panel
    add(title, BorderLayout.NORTH);

    //creates panel to hold keypad and gives it a 4x3 GridLayout
    GridLayout layout = new GridLayout(4, 3); // creates GridLayout object called "layout" with 4 rows, 3 columns
    JPanel keypanel = new JPanel(layout); //creates new layout object called keypanel

    //adds buttons representing keys to keypanel
    JButton key1 = new JButton("1");
    JButton key2 = new JButton("2");
    JButton key3 = new JButton("3");
    JButton key4 = new JButton("4");
    JButton key5 = new JButton("5");
    JButton key6 = new JButton("6");
    JButton key7 = new JButton("7");
    JButton key8 = new JButton("8");
    JButton key9 = new JButton("9");
    JButton keyAsterisk = new JButton("*");
    JButton key0 = new JButton("0");
    JButton keyPound = new JButton("#");

    //fills keypanel layout with the new buttons
    keypanel.add(key1);
    keypanel.add(key2);
    keypanel.add(key3);
    keypanel.add(key4);
    keypanel.add(key5);
    keypanel.add(key6);
    keypanel.add(key7);
    keypanel.add(key8);
    keypanel.add(key9);
    keypanel.add(keyAsterisk);
    keypanel.add(key0);
    keypanel.add(keyPound);

    //Centers the keys on the panel
    add(keypanel, BorderLayout.CENTER);

    JPanel titlePanel = new JPanel(); //New JPanel for JLabel title
    titlePanel.add(title); //Adds the "Your Telephone" title to this new panel
    add(titlePanel, BorderLayout.NORTH); //Readjusts the position of the title

}

}
