package DesignPatterns.BehavioralPattern.IteratorPattern.Collection.Impl;

import DesignPatterns.BehavioralPattern.IteratorPattern.Collection.IterableCollection;
import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Impl.BreadthFirstSearch;
import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Impl.DepthFirstSearch;
import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Iterator;
import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.IteratorTypes;

import java.util.List;

public class BinaryTree <T> implements IterableCollection {

    List<T> data;

    public BinaryTree(List<T> list) {
        this.data = list;
    }

    @Override
    public Iterator createIterator(IteratorTypes iteratorTypes) {
        if (IteratorTypes.BREADTH_FIRST.equals(iteratorTypes)) {
            return new BreadthFirstSearch(data);
        }
        if (IteratorTypes.DEPTH_FIRST.equals(iteratorTypes)) {
            return new DepthFirstSearch(data);
        }
        throw new IllegalArgumentException("No such iterator present");
    }
}
