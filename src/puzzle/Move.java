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
public abstract class Move {
    public static final int MAX_MOVES = 8;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final int WEST = 2;
    public static final int EAST = 3;  
    public static final int NORTH_EAST = 4;
    public static final int NORTH_WEST = 5;
    public static final int SOUTH_WEST = 6;
    public static final int SOUTH_EAST = 7;
    
    public abstract boolean isPossible(Position currentPosition) throws Exception;
    public abstract Position getNextPosition(Position currentPosition) throws Exception;
}

