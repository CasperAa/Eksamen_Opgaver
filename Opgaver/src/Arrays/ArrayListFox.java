package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFox {
    public static void main(String[] args) {

        //Arrays.assList example
        //ArrayList<String> fox = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox"));

        ArrayList<String> fox = new ArrayList<>();
        fox.add("the");
        fox.add("quick");
        fox.add("brown");
        fox.add("fox");

        //Example manuel
        System.out.println(fox.get(0) + " " + fox.get(1) + " " + fox.get(2) + " " + fox.get(3));

        //For loop example
        for(int i = 0; i < fox.size() ; i++){
            if(i==3){
                System.out.print(fox.get(i));
            } else {
                System.out.print(fox.get(i) + " ");
            }
        }
    }
}
