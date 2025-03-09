package DesignPatterns.BehavioralPattern.IteratorPattern.Iterator;

public interface Iterator {

    <T> T getNext();

    boolean hasNext();

}
