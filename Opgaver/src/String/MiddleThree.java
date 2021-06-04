package String;

public class MiddleThree {
    //Given a string of odd length, return the string length 3 from its middle,
    //so "Candy" yields "and". The string length will be at least 3.
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));

    }

    public static String middleThree(String str) {
        int middle = str.length()/2;
        return str.substring(middle-1,middle+2);
    }
}
