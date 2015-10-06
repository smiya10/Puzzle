/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

/**
 *
 * @author Syd
 */
import java.lang.String;

public class Position {
    int _x = -1;
    int _y = -1;
    Peg _currentPeg = Peg.Empty;
    
    public static Position Empty = new EmptyPosition();
    
    public static class EmptyPosition extends Position {
        public EmptyPosition() {
            super(-1,-1);
        }
    }
   
    public Position() {}
    
    public Position(int x , int y) {
        _x = x;
        _y = y;
    }
    
    public int getX() {
        return _x;
    }
    
    public int getY() {
        return _y;
    }
    
    public void setPeg(Peg peg){
        _currentPeg = peg;
        peg.setPosition(this);
    }
    
    public Peg getPeg(){
        return _currentPeg;
    }
    public void removePeg(){
        _currentPeg = Peg.Empty;
    }
    
    public boolean hasPeg(){
        return!Peg.isNullOrEmpty(_currentPeg);
    }
    
    public boolean isValid(){
        return (-1 < _x && _x < 5 && -1 < _y && _y < 5);
    }
    
    @Override
    public String toString(){
        String output = "row: " + Integer.toString(_x) + " Col:" + Integer.toString(_y) + " Peg: " + _currentPeg.toString();
        return output;
    } 
    
    
    public static boolean isNullOrEmpty(Position current) {
        return (current == null || current instanceof EmptyPosition);
    }
}
