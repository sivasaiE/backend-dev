package Interfaces;

public class ClientStack {


    public static void main(String[] args) {

        Arraystack as = new Arraystack();

        as.pop();
        as.isempty();
        as.push();

        System.out.println("printing linkedlist data");
        LinkedListStack lls = new LinkedListStack();
        lls.pop();
        lls.isempty();
        lls.push();


    }
}
