package Statemants_Conditions_Expressions;

public class printStatements {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "World";

        if(one.length() != two.length() ){
            System.out.println("Option 1");
        }
        else if ((one.startsWith("w") && one.length() == 5) || (two.startsWith("w") && two.length() == 5)){
            System.out.println("Option 2");
        }else {
            System.out.println("Option 3");
        }
    }
}
