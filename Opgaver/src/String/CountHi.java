package String;

public class CountHi {
    public static void main(String[] args) {

        System.out.println(countHi("abc hi ho hi ho hi ho"));
    }

    public static int countHi(String str) {
        int lengthOfString = str.length();
        int countOfHi = 0;

        for(int i = 0; i < lengthOfString-1 ; i++){
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                countOfHi++;
            }
        }

        return countOfHi;
    }
}
