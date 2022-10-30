package java24hours.Modem;

public class ModemTester{
    public static void main(String[] arguments){
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 50000;
        gateway.speed = 40000;
        System.out.println("Попытка подключения кабельного модема: ");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("Попытка подключения DSL модема: ");
        gateway.displaySpeed();
        gateway.connect();
        
    }   
}
