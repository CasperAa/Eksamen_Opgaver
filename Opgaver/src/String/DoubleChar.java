package String;

public class DoubleChar {
//Given a string, return a string where for every char in the original, there are two chars.

    public static void main(String[] args) {

        System.out.println(doubleChar("You-Have-a-fun-face"));

    }

    public static String doubleChar(String str) {
        int len = str.length();
        char ch;
        StringBuilder stBuild = new StringBuilder(len*2);
        for(int i = 0; i < len; i++)
        {
            ch = str.charAt(i);
            stBuild.append(ch);
            stBuild.append(ch);
        }
        return stBuild.toString();
    }

}
