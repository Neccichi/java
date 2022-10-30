package java24hours;


class Kratnost{
    public static void main(String[] arguments){
        int person = 1;
        int save[]= new int[400];
        int icon = 0;            
         /*   for(answer = 0; answer<=5200; answer++){
                if(answer % 13 == 0){
                    save[i] = answer;
                } 
            }
         */
         while (icon < 400){
             if( person % 13 ==0){
                 save[icon] = person;
                 icon ++;
             }
            person++;
         }
         
        System.out.println("------------------------------------------");
        System.out.println("Task 2:Нужно сохранить эти числа в массив");
        
        for(int s= 0; s<= 399; s++){
            System.out.println(s+"): "+save[s]);
        }
        
    }
}
