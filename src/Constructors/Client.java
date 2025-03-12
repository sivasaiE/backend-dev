package Constructors;
import Constructors.User;

public class Client {

    public static void main(String[] args) {

        // This will not work if u have a custom constructor in User class
        // all the obj's are stored in heap memory
        //User u = new User(); //This is a default constructor stores object in heap memory
        User user1 = new User(1, "Sai"); //This is a custom constructor stores object in heap memory
        System.out.println(user1.age);
        System.out.println(user1.name);

        // This will print the memory location of the object
        System.out.println(user1);





        // This is a copy constructor  object  stores its memory in heap memory and the values are copied from user1
        User user2 = new User(user1);
        // if we change the user2 object it will not affect the user1 object


        User user3 = user1;
        // This is a shallow copy and it just points to same memeory location and doesn't create a new object
        // new keyword is used to create objects

        System.out.println(user3); // This obj location will be same as user1

    }

}