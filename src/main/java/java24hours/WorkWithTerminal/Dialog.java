package java24hours.WorkWithTerminal;

import javax.swing.JDialog;
import javax.swing.JLabel;
 

public class Dialog extends JDialog {

    public Dialog() {
        JLabel pageLabel = new JLabel("Your number is approved", JLabel.CENTER);
        add(pageLabel);

        setVisible(false);

        setSize(300, 300);

        setLocationRelativeTo(null);
    }
}