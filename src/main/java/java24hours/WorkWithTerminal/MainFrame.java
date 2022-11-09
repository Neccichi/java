package java24hours.WorkWithTerminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        
    SystemTray tray = SystemTray.getSystemTray();
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Image image = toolkit.getImage("trayIcon.jpg");

    PopupMenu menu = new PopupMenu();

    MenuItem messageItem = new MenuItem("Show Message");
    messageItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "www.java2s.com");
      }
    });
    menu.add(messageItem);

    MenuItem closeItem = new MenuItem("Close");
    closeItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    menu.add(closeItem);
    TrayIcon icon = new TrayIcon(image, "SystemTray Demo", menu);
    icon.setImageAutoSize(true);
    tray.add(icon);
  
        
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
