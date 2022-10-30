package java24hours;

class SpaceRemover{
    public static void main(String[] arguments){
        String mostFamous = "Dendi - is the most famous dota player in Ukraine.";
        char[] mfl= mostFamous.toCharArray();
        for (int dex= 0; dex < mfl.length; dex++){
            char current = mfl[dex];
            if  (current != ' '){
                System.out.println(current);
            }else {
                System.out.println('.');
            }
        }
        System.out.println();
    }
}
