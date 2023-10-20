package org.example.linkedlists;

public interface LinkedList <E> {
    
    void addFirst( E element);
    void addLast( E element );
    
    E pollFirst();
    E pollLast();
    // poll removes elements
    
    E peekFirst();
    E peekLast();
    // peek looks at elements
    
    void clear();
    
    boolean contains(E element);

    int size();
}
