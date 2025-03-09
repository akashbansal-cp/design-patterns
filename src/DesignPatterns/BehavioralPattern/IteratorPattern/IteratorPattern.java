package DesignPatterns.BehavioralPattern.IteratorPattern;

import DesignPatterns.BehavioralPattern.IteratorPattern.Collection.Impl.BinaryTree;
import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Iterator;

import java.util.Arrays;
import java.util.Optional;
//import java.util.Iterator;

import static DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.IteratorTypes.BREADTH_FIRST;
import static DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.IteratorTypes.DEPTH_FIRST;

public class IteratorPattern {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Iterator breadthFirstSearch = binaryTree.createIterator(BREADTH_FIRST);
        Iterator depthFirstSearch = binaryTree.createIterator(DEPTH_FIRST);

        while (breadthFirstSearch.hasNext()) {
            Optional<Integer> itemOptional = Optional.ofNullable(breadthFirstSearch.getNext());
            itemOptional.ifPresent((item)->{
                System.out.print(item);
                System.out.print(" ");
            });
        }
        System.out.println();

        while (depthFirstSearch.hasNext()) {
            Optional<Integer> itemOptional = Optional.ofNullable(depthFirstSearch.getNext());
            itemOptional.ifPresent((item)->{
                System.out.print(item);
                System.out.print(" ");
            });
        }
        System.out.println();

    }

}
