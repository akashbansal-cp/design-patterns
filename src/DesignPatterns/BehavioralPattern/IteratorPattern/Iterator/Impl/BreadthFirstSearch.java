package DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Impl;

import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Iterator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch <T> implements Iterator {

    private List<T> data = new ArrayList<>();
    private Integer currentIndex = 0;

    public BreadthFirstSearch(List<T> tree) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int index = queue.remove();
            data.add(tree.get(index));
            if (index * 2 + 1 < tree.size()) {
                queue.add(index * 2 + 1);
            }
            if (index * 2 + 2 < tree.size()) {
                queue.add(index * 2 + 2);
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
