package java24hours.WorkWithTerminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{
    JTextField userData =  new JTextField(20);
    JButton okButton = new JButton("OK");
    private Dialog dialog;
    public MainFrame(){
        //Нстройка фрейма
        super("Test frame");
        setLookAndFeel();
        setSize(450, 200);
        
          
        //Text field
        JLabel pageLabel = new JLabel("Your value -", JLabel.RIGHT);
        FlowLayout flo2 = new FlowLayout();
        setLayout(flo2);
        add(pageLabel);
        add(userData);
        dialog = new Dialog();
        
        
        //Buttons
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(okButton);
        okButton.addActionListener(this);
        
        //EXIT
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }
    
        public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == okButton) {
            String userDaraReceive = userData.getText();//receive text in a field
            int userDataValue = Integer.parseInt(userDaraReceive);
            if(userDataValue > 100){
                System.out.println(userDaraReceive);
            dialog.setVisible(true);
            }
 
            
        }
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

}
