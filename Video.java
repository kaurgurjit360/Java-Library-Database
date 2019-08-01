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
public class Video extends MultiMediaItem{
    private String director;

     Video(String ID, String title, Date addedOn, int playingTime, String director) {
                  super(ID, title, addedOn, playingTime);

        this.director= director;
}
    public String getdirector() {
        return director;
    }
    public void setDirector(String director) {
this.director = director;
}
      
       public String toString() {
        return ("Id: " + getId() + "   "+ "Title: " + getTitle() + "   " + "AddedOn: " + getAddedOn() + "   " + "Playing Time: " + getPlayingTime() + "   " + "Director: " + getdirector());
    }
}
