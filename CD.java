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
public class CD extends MultiMediaItem{
    private String artist;
    
     CD(String Id, String title, Date addedOn, int playingTime, String artist) {
         super(Id, title, addedOn, playingTime);
        this.artist= artist;
}

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
this.artist = artist;
}
 
   @Override
    public String toString() {
        return ("Id: " + getId() + "   "+ "Title: " + getTitle() + "   " + "AddedOn: " + getAddedOn() + "   " + "Playing Time: " + getPlayingTime() + "   " + "Artist: " + getArtist());
    }
}
