package String;

public class CatDog {
    //Return true if the string "cat" and "dog" appear the same number of times in the given string.

    public static void main(String[] args) {

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
        System.out.println(catDog("catcatcat dog dogo dog"));
        System.out.println(catDog("ca"));
        System.out.println(catDog("catxdogxdogxca"));
    }

    public static boolean catDog(String str) {
        int lengthOfString = str.length()-2;
        int countDogs = 0;
        int countCats = 0;
        String tempStr = str.toLowerCase();

            for (int i = 0; i < lengthOfString; i++) {

                if (tempStr.charAt(i) == 'c' && tempStr.charAt(i + 1) == 'a' && tempStr.charAt(i + 2) == 't') {
                    countCats++;

                } else if (tempStr.charAt(i) == 'd' && tempStr.charAt(i + 1) == 'o' && tempStr.charAt(i + 2) == 'g') {
                    countDogs++;
                }
        }
        return countCats == countDogs;
    }
}
