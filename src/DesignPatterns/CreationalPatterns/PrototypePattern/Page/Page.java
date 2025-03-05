package DesignPatterns.CreationalPatterns.PrototypePattern.Page;

import DesignPatterns.CreationalPatterns.PrototypePattern.Prototype;

public class Page implements Prototype {
    public String pageData;
    public Integer pageNumber;
    public String headerAsString;

    public Page(){};

    public Page(Page page){
        super();
        this.pageData = page.pageData;
        this.pageNumber = page.pageNumber;
        this.headerAsString = page.headerAsString;
    }

    public Page clone(){
        return new Page(this);
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == this)return true;
        if(obj.getClass() != this.getClass())return false;
        if(this.pageData!=null && !this.pageData.equals(((Page) obj).pageData))return false;
        if(this.pageNumber!=null &&  !this.pageNumber.equals(((Page) obj).pageNumber))return false;
        if(this.headerAsString!=null && !this.headerAsString.equals(((Page) obj).headerAsString))return false;
        return true;
    }

}
