package Constructors;

public class User {

    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }


    // This is a custom copy constructor
    public User(User u) {
        this.age = u.age;
        this.name = u.name;
    }


}
