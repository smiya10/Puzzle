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
public class Puzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Board.getInstance().initializeBoard(0,0);
            Board.getInstance().start(0, 2);
        } catch (Exception e) {
            
        }   
    }
    
    
}
