/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.Comparator;

/**
 *
 * @author Gurjit
 */
public class SortByAddedOn implements Comparator<Item> {
    @Override
        public int compare(Item first, Item second) {
           return first.addedOn.compareTo(second.addedOn);
        }
}
