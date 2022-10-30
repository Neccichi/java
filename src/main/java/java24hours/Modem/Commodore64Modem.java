package java24hours.Modem;

public class Commodore64Modem extends Modem{
    String method = "модем: Commodore64";
    
    public void connect(){
        System.out.println("Подключение к Интернету.....");
        System.out.println("Используем " + method);
    }
    
    public void disconnect(){
        System.out.println("Отключение от Интернета ....");
        System.out.println("Используемый " + method + " отключен от Интернета");
    }
}