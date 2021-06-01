package Statemants_Conditions_Expressions;

import java.util.Scanner;

public class PrintStatement {
    public static void main(String[] args) {

        System.out.println(returnType(2));
        System.out.println(returnType(0));
        System.out.println(returnType(10231));
        System.out.println(returnType(-2));

        //Ekstra ting (Scanner og input)
        Scanner userInput = new Scanner(System.in);

        System.out.println("Skriv et nummer");
        System.out.println(returnType(userInput.nextInt()));
    }

    public static String returnType (int integer){

        String positive = "Positive";
        String largePositive = "Large Positive";
        String zero = "Zero";
        String negative = "Negative";

        if(integer > 0 && integer < 10000){
            return positive;
        } else if (integer > 10000){
            return largePositive;
        } else if (integer < 0){
            return negative;
        } else{
            return zero;
        }
    }
}

//Ekstra Ting
class Cat{

    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}