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
public class SortByDirector implements Comparator {
 @Override
      public int compare(Object first, Object second) {
       if(first instanceof Video && second instanceof Video) {
              Video obj1 = (Video)first;
              Video obj2 = (Video)second;
              return (obj1.getdirector().compareTo(obj2.getdirector()));
        }
        return 0;
    }
}
