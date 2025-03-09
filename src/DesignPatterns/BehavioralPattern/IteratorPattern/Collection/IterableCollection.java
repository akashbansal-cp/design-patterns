package DesignPatterns.BehavioralPattern.IteratorPattern.Collection;

import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.Iterator;
import DesignPatterns.BehavioralPattern.IteratorPattern.Iterator.IteratorTypes;

public interface IterableCollection {

    Iterator createIterator(IteratorTypes iteratorTypes);

}
