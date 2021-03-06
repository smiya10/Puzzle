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
public class Board {
    final int MAX_ROW = 5;
    final int MAX_COL = 5;
    Position[][] _board = new Position[5][5];
    
    private static Board _instance = null;
    
    private Board() {
        zeroBoard();
    }
    
    public static Board getInstance() {
        if(_instance == null)
            _instance = new Board();
        
        return _instance;
    }
    
    private void zeroBoard(){
        for(int i = 0; i < MAX_ROW; i++){
            for(int j = 0; j < MAX_COL; j++){
                _board[i][j] = Position.Empty;
            }
        }
    }
    
    public Board initializeBoard(int row, int col) throws Exception {
        for (int i = 0; i < MAX_ROW; i++){
            for (int j = 0; j < MAX_COL - i; j++){
                _board[i][j] = new Position(i, j);
            }
        }
        
        setPegs();
        removePeg(row, col);
        return getInstance();
    }
    
    private void setPegs(){
        for(int i = 0; i < MAX_ROW; i++){
            for(int j = 0; j < MAX_COL; j++){
                if(!Position.isNullOrEmpty(_board[i][j]))
                    _board[i][j].setPeg(new Peg());
            }
        }
    }
    
    public void printBoard(){
        for(int i = 0; i < MAX_ROW; i++){
            for(int j = 0; j < MAX_COL; j++){
               if(!Position.isNullOrEmpty(_board[i][j]))
                System.out.println(_board[i][j].toString());
            }
        }
    }
    
    public void removePeg(int row, int column) throws Exception{
        positionAt(row, column).removePeg();
    } 
    
    public Position positionAt(int row, int col) throws Exception {
        if(row < 0 || row == MAX_ROW)
            throw new Exception("Row: " + row + " is out of bounds");
        
        if(col < 0 || col == MAX_COL)
            throw new Exception("Col: " + col + " is out of bounds");
        
        return _board[row][col];
    }
    
    public void start(int x, int y) throws Exception {
        positionAt(x, y).getPeg().jump();
    }
}
