package Interfaces;
// if an interface has 10 methods we should impelement all the methods in the class that implements the interface
// we can have attributes in interface but they are constants abd they cannot be changed
// an interface is to basically generalize the behaviours of a categorized entities
// we can have multiple interfaces in a class
// we cannot create objects for interfaces
// Animal c = new Cat(); is valid but we cannot access methods that are in class cat


public class Cat implements Animal{

    @Override
    public void eat(){
        System.out.println("cat is  eating");
    }

    @Override
    public void sleep(){
        System.out.println("cat is  sleeping");
    }

    @Override
    public void breathe(){
        System.out.println("cat is  breathing");
    }


    public void meow(){
        System.out.println("cat is  meowing");
    }


    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.sleep();
        c.breathe();
        c.meow();
        System.out.println("Age of the animal is: " + age);
    }

}
