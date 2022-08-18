package com.ali.behavioral.iterator;

public interface Iterator {
    Object next();
    boolean hasNext();
    Object currentItem();
}
