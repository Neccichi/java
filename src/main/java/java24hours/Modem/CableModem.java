package java24hours.Modem;

public class CableModem extends Modem{
    String method = "кабельное подключение";
    
    public void connect(){
        System.out.println("Подключение к Интернету.....");
        System.out.println("Используем " + method);
    }
}
