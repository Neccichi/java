package java24hours;

class Grade_if{
    public static void main(String[] arguments){
        int grade = 101;
        System.out.println("Yor mark = " + grade);
        if ( grade <= 25){
            System.out.println("Your rank is F");
        }else if(grade <=50 & grade > 25){
            System.out.println("Your rank is C");
        }else if(grade <=75 & grade > 50){
            System.out.println("Your rank is B");
        }else if(grade <=100 & grade > 75){
            System.out.println("Your rank is A");
        }else{
            System.out.println("Impossible mark");
        }
    }
}
