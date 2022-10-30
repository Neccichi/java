package java24hours;

import java.util.*;

class averageMark{
    public static void main(String[] arguments){
        int[][] students = new int[3][3];
        int[] Tim = {90,75,76};
        int[] Karina = {99,87,91};
        int[] Andrew = {66,80,72};
        
        students[0] = Tim;
        students[1] = Karina;
        students[2] = Andrew;
        
        for (int[] anArr : students) {
            for (int anAnArr : anArr) {
            System.out.print(anAnArr + " ");
            }
        System.out.println();
        }
        
        System.out.println("--------------");
        System.out.println("Average marks: ");
        
        float averageTim = 0;
        float averageKarina = 0;
        float averageAndrew = 0;
        //average Tim
        if (Tim.length > 0)
        {
            float sumTim = 0;
            for (int j = 0; j < Tim.length; j++) {
            sumTim += Tim[j];
        }
            averageTim = sumTim / Tim.length;
        }
        //average Karina
        if (Karina.length > 0)
        {
            float sumKarina = 0;
            for (int k = 0; k < Karina.length; k++) {
            sumKarina += Karina[k];
        }
            averageKarina = sumKarina / Karina.length;
        }
        //average Andrew
        if (Andrew.length > 0)
        {
            float sumAndrew = 0;
            for (int a = 0; a < Andrew.length; a++) {
            sumAndrew += Andrew[a];
        }
            averageAndrew = sumAndrew / Andrew.length;
        }
        
        float globalMark = (averageTim + averageKarina + averageAndrew)/3;
        
        
        
        
        System.out.println("Tim`s average mark = " + averageTim);
        System.out.println("Karina`s average mark = " + averageKarina);
        System.out.println("Andrew`s average mark = " + averageAndrew);
        System.out.println("--------------");
        System.out.println("Global average mark = "+ globalMark);
        
    }
}
