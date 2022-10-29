package java24hours;

class Root{
    public static void main(String[] arguments){
        int number = 255;
        System.out.println("Квадратний корінь з "
        + number
        + " дорівнює "
        + Math.sqrt(number)
        );
        System.out.println("-----------------------------------------------------");
        System.out.println("Упражнение 1 - квардратный корень из 625");
        System.out.println(Math.sqrt(625));
        System.out.println("-----------------------------------------------------");
        System.out.println("Упражнение 2 - квардратный корень из числа, переданого в качестве аргумента");
        int task2= 777;
        double answer = Math.sqrt(task2);
        System.out.println(answer);
        
    }
}
