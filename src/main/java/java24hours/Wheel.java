package java24hours;

class Wheel{
    public static void main(String[] arguments){
        String[] phrase = {
            "LOVE IS",
            "SOMETHING THAT",
            "YOU NEED TO",
            "FEEL ONLY",
            "BY YOUR OWN"
        };
        int[] letterCount = new int[26];
        for(int count = 0; count < phrase.length; count++){
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for(int count2 = 0; count2 < letters.length; count2++){
                char lett = letters[count2];
                if((lett >= 'A')&(lett <= 'Z')){
                    letterCount[lett - 'A']++;
                }
            }  
        }
        for (char count = 'A'; count <= 'Z'; count++){
            System.out.print(count + ": " +
                    letterCount[count - 'A'] +
                    " ");
            if(count == 'M'){
                System.out.println();
            }
        }
        System.out.println();
    }
}
