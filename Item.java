/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.Date;

/**
 *
 * @author Gurjit
 */
abstract public class Item implements Comparable<Item> {
    public String Id;
    public String title;
    public Date addedOn;  
    Item(String Id, String title, Date addedOn) {
        this.Id=Id;
        this.addedOn=addedOn;
        this.title= title;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the addedOn
     */
    public Date getAddedOn() {
        return addedOn;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param addedOn the addedOn to set
     */
    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }
    //what if you have a class thats not implemt
    @Override
    //passing one object; comparing the 
    public int compareTo(Item other) 
    {
    return this.Id.compareTo(other.Id);
}

}
