package java24hours.WorkWithTerminal;

import javax.swing.JDialog;
import javax.swing.JLabel;
 
/*
 * Класс второго окна
 * */
public class NotDialog extends JDialog {
    //Конструктор второго окна
    public NotDialog() {
        JLabel pageLabel = new JLabel("Your number is not approved", JLabel.CENTER);
        add(pageLabel);
        //Делаем невидимым окно
        setVisible(false);
        //Устанавливаем размеры
        setSize(300, 300);
        //Отображаем по центру
        setLocationRelativeTo(null);
    }
}
