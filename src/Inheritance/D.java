package Inheritance;

public class D extends C {

    int age;



    public D() {
        // Super only cals constructor its parent not the parent of the parent(immediate parent)
        super("Hello");
    }


    public static void main(String[] args) {

        D d = new D();

    }
}
