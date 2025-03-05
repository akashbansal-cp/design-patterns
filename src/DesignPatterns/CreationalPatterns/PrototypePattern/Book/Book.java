package DesignPatterns.CreationalPatterns.PrototypePattern.Book;

import DesignPatterns.CreationalPatterns.PrototypePattern.Page.Page;
import DesignPatterns.CreationalPatterns.PrototypePattern.Prototype;
import DesignPatterns.CreationalPatterns.PrototypePattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Book implements Prototype {

    public List<Page> pages;
    public String name;
    public Integer totalPages;
    public Integer currentPage;

    public abstract Page getNextPage();

    public abstract void display();

    protected Book(){};

    protected Book(Book book){
        if(Objects.nonNull(book.pages)){
            this.pages = new ArrayList<>();
            for(Page page: book.pages){
                this.pages.add(page.clone());
            }
        }

        this.totalPages = book.totalPages;
        this.currentPage = book.currentPage;
        this.name = book.name;
    }

    public Prototype clone(){
        try {
            Object obj = super.clone();
            return (Prototype) obj;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

}
