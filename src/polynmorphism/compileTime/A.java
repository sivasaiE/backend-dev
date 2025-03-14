package polynmorphism.compileTime;

//Same method signature and return type with different no.of arguments
// Compile time Poylmorphism(Method Overloading)

public class A {

    public void hello(){
        System.out.println("hello");
    }


    public void hello(String inputname){
        System.out.println("hello "+ inputname );
    }

    public void hello(int age){
        System.out.println("hello "+ age );
    }


}
