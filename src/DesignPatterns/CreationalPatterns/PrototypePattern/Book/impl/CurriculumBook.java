package DesignPatterns.CreationalPatterns.PrototypePattern.Book.impl;

import DesignPatterns.CreationalPatterns.PrototypePattern.Book.Book;
import DesignPatterns.CreationalPatterns.PrototypePattern.Prototype;
import DesignPatterns.CreationalPatterns.PrototypePattern.Page.Page;

public class CurriculumBook extends Book {

    public String subject;

    @Override
    public Page getNextPage() {
        return pages.get(0);
    }

    @Override
    public void display() {
        System.out.println("subject"+subject);
    }

    public CurriculumBook(){
        super();
    }

    CurriculumBook(CurriculumBook book){
        super(book);
        this.subject = book.subject;
    }


    public Prototype clone() {
        return new CurriculumBook(this);
    }
}
