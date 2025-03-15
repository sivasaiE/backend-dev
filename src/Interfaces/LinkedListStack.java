package Interfaces;

import java.util.Stack;

public class LinkedListStack  implements stack{

    @Override
    public void push() {
        System.out.println("pushing the element");
    }

    @Override
    public void pop() {
        System.out.println("popping the element");
    }

    @Override
    public void isempty() {
        System.out.println("checking if the LinkedList is empty");
    }
}
