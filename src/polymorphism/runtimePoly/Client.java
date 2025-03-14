package polymorphism.runtimePoly;

public class Client {


    public static void main(String[] args) {


        // bcoz we have overridden the parent class(A) hello method in Child class(B)

        // objects will always the method of the class in which it is created
        B b = new B();
        b.hello();



    }
}
