package DesignPatterns.CreationalPatterns.PrototypePattern.Book.impl;

import DesignPatterns.CreationalPatterns.PrototypePattern.Book.Book;
import DesignPatterns.CreationalPatterns.PrototypePattern.Page.Page;
import DesignPatterns.CreationalPatterns.PrototypePattern.Prototype;

public class Novel extends Book {

    public String genre;

    @Override
    public Page getNextPage() {
        return pages.get(0);
    }

    @Override
    public void display() {
        System.out.println("genre: " + genre);
        for (Page p : pages) {
            System.out.println(p.pageNumber + p.pageData + p.headerAsString);
        }
    }

    public Novel() {
        super();
    }

    Novel(Novel novel) {
        super(novel);
        this.genre = novel.genre;
    }

    public Novel clone() {
        return new Novel(this);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj.getClass()!=this.getClass())
            return false;
        // go for each item
        if(this.pages != null && !this.pages.equals(((Novel) obj).pages))return false;
        if(this.genre != null && !this.genre.equals(((Novel) obj).genre))return false;
        if(this.name != null && !this.name.equals(((Novel) obj).name))return false;
        if(this.currentPage != null && !this.currentPage.equals(((Novel) obj).currentPage))return false;
        if(this.totalPages != null && !this.totalPages.equals(((Novel) obj).totalPages))return false;
        return true;

    }

}
