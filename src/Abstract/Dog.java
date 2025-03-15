package Abstract;

// Animal class has an abstract method walk whcih is implemented in Dog class bcoz dog has different walking style and other animals
// once we dont know the exact implementation of the method we can declare it as abstract method and the class automatically becomes abstract class
// we can implement the abstract method in the subclass
// if we dont declare all the methods in the subclass then the subclass also becomes abstract class
// subclass need not be an abstract class if we implement all the methods in the subclass
// if any class one abstract method then it becomes abstract class

public class Dog extends Animal {

    @Override
    void walk() {
        System.out.println("Dog is walking with four legs");
    }


    void eat() {
        System.out.println("Dog is eating");
    }


}
