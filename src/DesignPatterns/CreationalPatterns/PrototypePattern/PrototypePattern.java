package DesignPatterns.CreationalPatterns.PrototypePattern;

import DesignPatterns.CreationalPatterns.PrototypePattern.Book.Book;
import DesignPatterns.CreationalPatterns.PrototypePattern.Book.impl.CurriculumBook;
import DesignPatterns.CreationalPatterns.PrototypePattern.Book.impl.Novel;
import DesignPatterns.CreationalPatterns.PrototypePattern.Page.Page;

import java.util.ArrayList;
import java.util.Arrays;

public class PrototypePattern {

    Novel novel;
    CurriculumBook curriculumBook;

    public PrototypePattern() {
        novel = new Novel();
        curriculumBook = new CurriculumBook();
    }

    public void doStuff() {

        novel.genre = "Harry Potter";

        Page p1 = new Page();
        p1.pageData = "p1";
        p1.pageNumber = 1;
        p1.headerAsString = "h1";

        Page p2 = new Page();
        p2.pageData = "p2";
        p2.pageNumber = 2;
        p2.headerAsString = "h2";

        novel.pages = new ArrayList<>();
        novel.pages.add(p1);
        novel.pages.add(p2);

        novel.display();

        Novel novelCopy = novel.clone();
        System.out.println(novelCopy.equals(novel));
        novel.pages.remove(1);
        novelCopy.display();
        Prototype curriculumCopy = curriculumBook.clone();


    }

}
