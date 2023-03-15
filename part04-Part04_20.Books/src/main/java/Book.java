/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ste-PC
 */
public class Book {
    private String name;
    private int pages;
    private int publicationYear;
    
    public Book(String name, int pages, int publicationYear){
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getPublicationYear(){
        return this.publicationYear;
    }
    
    public String toString(){
        return this.getName() + ", " + this.getPages() + " pages, " + this.getPublicationYear();
    }
    
    
}
