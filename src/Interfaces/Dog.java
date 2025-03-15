package Interfaces;

public class Dog implements Animal{

    @Override
    public void eat(){
        System.out.println("dog is  eating");
    }

    @Override
    public void sleep(){
        System.out.println("dog is  sleeping");
    }

    @Override
    public void breathe(){
        System.out.println("dog is  breathing");
    }


    public void bark(){
        System.out.println("dog is  barking");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.breathe();
        d.bark();
        System.out.println("Age of the animal is: " + age);
    }

}
