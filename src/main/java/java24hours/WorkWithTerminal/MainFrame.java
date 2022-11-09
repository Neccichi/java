package java24hours.WorkWithTerminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JTextField;



public class MainFrame extends JFrame implements ActionListener{
    
    JFrame window;
    JTextField userData =  new JTextField(20);
    JButton okButton = new JButton("OK");
    private Dialog NumberApproved;
    private NotDialog NumberNotApproved;


    public MainFrame(){
        //Нстройка фрейма
        window = new JFrame();
        //super("Test frame");
        setLookAndFeel();
        window.setSize(450, 200);
        
          
        //Text field
        JLabel pageLabel = new JLabel("Your value -", JLabel.RIGHT);
        FlowLayout flo2 = new FlowLayout();
        setLayout(flo2);
        window.add(pageLabel);
        window.add(userData);
        NumberApproved = new Dialog();
        NumberNotApproved = new NotDialog();

        
        
        //Buttons
        FlowLayout flo = new FlowLayout();
        window.setLayout(flo);
        window.add(okButton);
        okButton.addActionListener(this);
        
        //EXIT
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);  
        
    }
    

    
        public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == okButton) {
            String userDataReceive = userData.getText();//receive text in a field
            int userDataValue = Integer.parseInt(userDataReceive);
            if(userDataValue > 100){
            NumberApproved.setVisible(true);
            }else if(userDataValue <= 100){
                NumberNotApproved.setVisible(true);
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
