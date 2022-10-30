package java24hours;

import java.util.*;

class NameSorter{
    public static void main(String[] arguments){
        String[] names = {"Andrew", "Tim", "Karina", "Yarko",
        "Dima", "Ravil", "Grisha"};
        System.out.println("before sort: ");
        for (int i = 0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
        
        Arrays.sort(names);
        System.out.println("After sort: ");
        for (int i = 0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
    }   
}
