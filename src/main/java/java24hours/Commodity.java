package java24hours;

class Commodity{
    public static void main(String[] arguments){
    String command = "POKYPKA";
    int balance = 550;
    int quantity = 42;
    
    switch (command) {
        case "POKYPKA":
            quantity +=5;
            balance -=20;
            break;
        case "SALE":
            quantity -=5;
            balance +=15;
    System.out.println("Balance: $" + balance + "\n" +
            "Quantity: " + quantity);
   }
  }
} 
