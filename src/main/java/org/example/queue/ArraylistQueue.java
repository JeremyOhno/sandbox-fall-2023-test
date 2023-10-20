package org.example.queue;

import java.util.ArrayList;
import java.util.List;

public class ArraylistQueue <T> implements Queue<T>{

    private List<T> queue;

    public ArraylistQueue(){
        queue = new ArrayList<>();
    }

    @Override
    public boolean offer(T t) {
        return queue.add(t);
    }

    @Override
    public T poll() {
        return queue.remove(0);
    }

    @Override
    public T peek() {
        return queue.get(0); //get doesn't remove it
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
