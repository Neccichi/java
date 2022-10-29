package java24hours;

class Credits{
    public static void main(String[] arguments){
        String title = "Акулий торнадо"; 
        int year = 2013;
        String director = " Энтони Ферранте" ; 
        String role1 = "Фин" ;
        String actor1 = "Йен Зиринг"; 
        String role2 = "Эйприл" ;
        String actor2 = "Тара Рид" ;
        String role3 = "Джордж";
        String actor3 = "Джон Херд";
        String role4 = "Нова" ; 
        String actor4 = " Кэсси Сербо" ; 
        
        //создаем переменные актеров и режесеров для прописных строк
        
        String bigDirector = director.toUpperCase();
        String bigActor1 = actor1.toUpperCase();
        String bigActor2 = actor2.toUpperCase();
        String bigActor3 = actor3.toUpperCase();
        String bigActor4 = actor4.toUpperCase();

        
        System.out.println(""+title +" (" + year + " ) \n" + 
                " Режиссер" + "\t" + bigDirector + " \n" +
                role1 + "\t" + bigActor1 + " \n" +
                role2 + "\t" + bigActor2 + " \n" +
                role3 + "\t" + bigActor3 + " \n" +
                role4 + "\t" + bigActor4 ); 
    }
}
 