
package java24hours;

import java.util.*;

class Dice{
    public static void main(String[] arguments){
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("Random number "
                + value);
    }
}