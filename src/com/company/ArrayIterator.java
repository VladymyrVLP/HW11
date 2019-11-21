package com.company;

import java.util.Iterator;


public class ArrayIterator<E> implements Iterator {
    private E[] array;
    private int index = 0;

    public ArrayIterator(E[] array) {
        this.array = array;
    }
    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public E next() {

            return array[index++];

    }
}

