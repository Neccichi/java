package java24hours.WorkWithTerminal;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.*;

import javax.swing.JTextField;
import javax.swing.border.Border;



public class MainFrame extends JFrame implements ActionListener{
    JFrame window;
    JTextField userData =  new JTextField(20);
    JButton okButton = new JButton("OK");
    private Dialog NumberApproved;
    private NotDialog NumberNotApproved;
    ImageIcon myIcon = new ImageIcon("myicon.png");


    public MainFrame() throws MalformedURLException{

        try {
            //Нстройка фрейма
     
            window = new JFrame();
          
            //super("Test frame");
            setLookAndFeel();
            
            //app on the center
            window.setSize(450, 200);
            window.setLocationRelativeTo(null);
            window.setVisible(true);
            window.setTitle("Test app");
            window.setIconImage(myIcon.getImage());
            
            //background color and textfield settings
            Color backcol = new Color(95,75,139);
            Color bordercol=  new Color(230,158,143);
            window.getContentPane().setBackground(backcol);
            userData.setOpaque(false);
            
            //jtextfield border settings
            userData.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
            Border oldBorder = userData.getBorder();
            Border redBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, bordercol);
            Border newBorder = BorderFactory.createCompoundBorder(redBorder, oldBorder);
            userData.setBorder(newBorder);
            
            //jtextfield text settings
            userData.setForeground(bordercol);
            Font mainFont = new Font("SansSerif", Font.BOLD, 20);
            userData.setFont(mainFont);
            
            
            //label settings
            JLabel pageLabel = new JLabel("Your value -", JLabel.RIGHT);
            pageLabel.setFont(mainFont);
            pageLabel.setForeground(bordercol);
            
            //layout and components
            FlowLayout flo2 = new FlowLayout();
            setLayout(flo2);
            window.add(pageLabel);
            window.add(userData);
            NumberApproved = new Dialog();
            NumberNotApproved = new NotDialog();
            
            //only numers check
            userData.addKeyListener(new KeyAdapter(){
                public void keyPressed(KeyEvent ke){
                    String value = userData.getText();
                    int l = value.length();
                    if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    userData.setEditable(true);
                    } else if(ke.getKeyChar() == '\b'){/*backslash*/
                    userData.setEditable(true);       
                    }else if(l>20){
                    userData.setEditable(false);
                    }else{
                    userData.setEditable(false);
                    
            }
                }
            });
            
            
            
            //Buttons
            FlowLayout flo = new FlowLayout();
            window.setLayout(flo);
            window.add(okButton);
            okButton.addActionListener(this);
            
            //EXIT
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            
            //TRAY
            
            SystemTray tray = SystemTray.getSystemTray();
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            URL url = new URL("https://i.pinimg.com/236x/eb/75/cf/eb75cfcdb05a1f04a46ae26834fa8053.jpg");
            Image image = toolkit.getImage(url);
            
            PopupMenu menu = new PopupMenu();
            
            MenuItem messageItem = new MenuItem("Test");
            messageItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Test <3");
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
        } catch (AWTException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        
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
    
    public static void main(String[] arguments) throws MalformedURLException{
        MainFrame frame = new MainFrame();
    }

}
