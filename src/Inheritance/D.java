package Inheritance;

public class D extends C {

    int age;



    public D() {
        // Super only cals constructor its parent not the parent of the parent(immediate parent)
        super("Hello");
    }


    public static void main(String[] args) {

        D d = new D();


        //attributs can be only class A but behaviours of class D
        // as class D extends class A(not immmidiate parent)
        // a object is of class D but reference is of class A
        // if we want our methods to only access the methods of class D but attributes of its parent class A,B,C we can use this
        A a = new D();



    }
}
