package ru.kiseleva.lab5;

import java.util.Comparator;

public class SortMode implements Comparator<Point> {

    private boolean sortUp;
    private int sortMode;

    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
    }

        @Override
    public int compare(Point p1, Point p2) {
        int res = 0;
        if (sortMode == 0) {
            if (p1.getId() > p2.getId()) {
                res = 1;
            } else if (p1.getId() < p2.getId()) {
                res = -1;
            }
         } else if (sortMode == 1) {
            res = p1.getName().compareTo(p2.getName());
        } else if (sortMode == 2){
            if (p1.numberOfVariables() > p2.numberOfVariables()) {
                res = 1;
            } else if (p1.numberOfVariables() < p2.numberOfVariables()) {
                res = -1;
            }
        } else {
            if (p1.year()> p2.year()) {
                res = 1;
            }
            else {
                 if (p1.year() < p2.year()) {
                    res = -1;  
                }  
                  else {
                     if (p1.month() > p2.month()) {
                          res = 1;
                      }
                      else {
                         if (p1.month() < p2.month()) {
                              res = -1;
                          }
                         else {
                          if (p1.number() >p2.number())
                              res = 1;
                          else {
                              if (p1.number() < p2.number())
                                  res = -1;
                              else {
                                  if (p1.hour() > p2.hour())
                                      res = 1;
                                  else {
                                      if (p1.hour() < p2.hour())
                                          res = -1;
                                      else {
                                          if (p1.minutes() > p2.minutes())
                                              res = 1;
                                          else res = -1;
                                      }
                                  }
                          } 
                          }                  
                     }
                     }
                     }
                 }    
            }
        if (sortUp) {
            res *= (-1);
        }
        return res;
    }
}
