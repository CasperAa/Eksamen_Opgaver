package Inheritance;

public class Park {
    public static void main(String[] args) {

        Dog dog1 = new Dog ("Rollo", 2, "Beagle");
        Dog dog2 = new Dog ("King", 3,"Bulldog");

        System.out.println("The two dogs were at the park, they are called " + dog1.name + " and " + dog2.name + ", and they are best friends!");
    }
}
