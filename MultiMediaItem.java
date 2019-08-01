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
abstract public class MultiMediaItem extends Item{
    public int playingTime;
    
     MultiMediaItem(String Id, String title, Date addedOn, int playingTime) {
         super(Id, title,addedOn);
         this.playingTime = playingTime;
}

    /**
     * @return the playingTime
     */
    public int getPlayingTime() {
        return playingTime;
    }
    public void setPlayingTime(int playingTime) {
    this.playingTime = playingTime;
}
    
}
