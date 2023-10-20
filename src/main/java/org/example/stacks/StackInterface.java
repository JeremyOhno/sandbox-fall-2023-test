package org.example.stacks;

public interface StackInterface<E> {

    boolean empty();
    E peek();
    E pop();
    void push(E element);
    int search(E item);

}
