package java24hours.WorkWithTerminal;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    public MainFrame(){
        //Нстройка фрейма
        super("Test frame");
        setLookAndFeel();
        setSize(450, 200);
        
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
}
