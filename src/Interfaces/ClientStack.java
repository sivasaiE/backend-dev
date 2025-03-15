package Interfaces;

public class ClientStack {


    public static void main(String[] args) {

        stack as = new Arraystack();

        as.pop();
        as.isempty();
        as.push();

        System.out.println("printing linkedlist data");
        stack lls = new LinkedListStack();
        lls.pop();
        lls.isempty();
        lls.push();


    }
}
