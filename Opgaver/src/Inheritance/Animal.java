package Inheritance;

public abstract class Animal {
    String name;
    int age;

    public Animal (String name, int age){
        this.age = age;
        this.name = name;
    }

    public abstract String sound();

}
