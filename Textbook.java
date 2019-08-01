/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
//import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gurjit
 */
public class Textbook extends Item{
    private String author;

    
     Textbook(String Id, String title, Date addedOn, String author) {
         super(Id,title,addedOn);
         this.author = author;
}
    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
        public String toString() {
        return ("Id: " + getId() + "   "+ "Title: " + getTitle() + "   " + "AddedOn: " + getAddedOn() + "   " +  "Author: " + getAuthor());
    }

}