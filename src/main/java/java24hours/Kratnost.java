package java24hours;

class Kratnost{
    public static void main(String[] arguments){
        int answer;
       
        for(answer = 1; answer<=5200; answer++){
            if(answer % 13 == 0){
                System.out.println(answer);
            } 
        }
    }
}
