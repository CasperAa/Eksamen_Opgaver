package Inheritance;

public class Dog extends Animal {

    String race;

    public Dog (String name, int age, String race){
        super(name, age);
        this.name = name;
        this.age = age;
        this.race = race;
    }
    @Override
    public String sound(){
        return "bark";
    }
}
