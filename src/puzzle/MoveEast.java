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
public class MoveEast extends Move {
     public boolean isPossible(Position currentPosition) throws Exception {
        Position possible = Board.getInstance().positionAt(currentPosition.getX(), currentPosition.getY() - 2);
        return possible.isValid() && !possible.hasPeg();
    }
    
    public Position getNextPosition(Position currentPosition) throws Exception {
        return Board.getInstance().positionAt(currentPosition.getX(), currentPosition.getY() - 2);
    }
}
