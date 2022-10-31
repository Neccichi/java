package java24hours.WorkWithTerminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{
    public MainFrame(){
        //Нстройка фрейма
        super("Test frame");
        setLookAndFeel();
        setSize(450, 200);
          
        //Text field
        JLabel pageLabel = new JLabel("Your value -", JLabel.RIGHT);
        JTextField userData =  new JTextField(20);
        FlowLayout flo2 = new FlowLayout();
        setLayout(flo2);
        add(pageLabel);
        add(userData);
        String userDaraReceive = userData.getText();//receive text in a field
        
        //Buttons
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton okButton = new JButton("OK");
        add(okButton);
        
        //EXIT
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }
    
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFell"
            );
        }catch(Exception exc){
            //Ignore mistakes
        }
    }
    
    public static void main(String[] arguments){
        MainFrame frame = new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
