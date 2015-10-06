/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package puzzle;

import java.lang.String;
import java.util.Stack;

/**
 *
 * @author Syd
 */
public class Peg {
    Move[] _moves = new Move[8];
    Position _currentPosition;
    public static Peg Empty = new EmptyPeg();
    Stack movestack = new Stack();
        
    public Peg(){
        _moves[Move.NORTH] = new MoveNorth();
        _moves[Move.SOUTH] = new MoveSouth();
        _moves[Move.WEST] = new MoveWest();
        _moves[Move.EAST] = new MoveEast();
        _moves[Move.NORTH_EAST] = new MoveNorthEast();
        _moves[Move.NORTH_WEST] = new MoveNorthWest();
        _moves[Move.SOUTH_WEST] = new MoveSouthWest();
        _moves[Move.SOUTH_EAST] = new MoveSouthEast();
    }
    
    public static boolean isNullOrEmpty(Peg current) {
        return (current == null || current instanceof EmptyPeg);
    }
   
    public void jump() throws Exception {
        for(int i = 0; i < Move.MAX_MOVES; i++) {
            if(_moves[i].isPossible(_currentPosition) && movestack.search(_moves[i].getNextPosition(_currentPosition)) == .1) {
                _currentPosition.removePeg();
                _currentPosition = _moves[i].getNextPosition(_currentPosition);
                _currentPosition.setPeg(this);
                movestack.push(_currentPosition);
                break;
            }
        }
    }
    
    public void setPosition(Position current) {
        _currentPosition = current;
    }
    
    @Override
    public String toString() {
        return "P";
    }
    
    public static class EmptyPeg extends Peg {
        
        @Override 
        public String toString() {
            return ("Null");
        }
    }
}
