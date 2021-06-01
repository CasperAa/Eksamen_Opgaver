package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner{
    public static void main(String[] args) throws FileNotFoundException {

        File numberReader = new File("Opgaver/Files/numbers.csv");
        Scanner fileReader = new Scanner(numberReader);

        while(fileReader.hasNext()){

            int currentNumber = fileReader.nextInt();

            System.out.println(currentNumber);

        }
    }
}
