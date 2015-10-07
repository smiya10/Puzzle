/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

/**
 * Entry and main.
 * 
 */
public class Puzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Board.getInstance().initializeBoard(0,0); //creates board, initial empty at (0, 0)
            Board.getInstance().start(0, 2); // runs board starting @ (0, 2)
        } catch (Exception e) {
            
        }   
    }
    
    
}
