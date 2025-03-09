package DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Impl;

import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch <T> implements Iterator {

    List<T> data = new ArrayList<>();
    Integer currentIndex = 0;

    public DepthFirstSearch(List<T> data) {
        if (data.isEmpty()) return;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            Integer index = stack.pop();
            this.data.add(data.get(index));
            if (index * 2 + 1 < data.size()) {
                stack.push(index * 2 + 1);
            }
            if (index * 2 + 2 < data.size()) {
                stack.push(index * 2 + 2);
            }
        }

    }

    @Override
    public T getNext() {
        if (hasNext())
            return data.get(currentIndex++);

        return null;

    }

    @Override
    public boolean hasNext() {
        return currentIndex < data.size();
    }
}
