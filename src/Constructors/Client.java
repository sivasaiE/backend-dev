package Constructors;
import Constructors.User;

public class Client {

    public static void main(String[] args) {

        // This will not work if u have a custom constructor in User class
        // all the obj's are stored in heap memory
        //User u = new User(); //This is a default constructor stores object in heap memory

        User user = new User(1, "Sai"); //This is a custom constructor stores object in heap memory
        System.out.println(user.age);
        System.out.println(user.name);
    }

}