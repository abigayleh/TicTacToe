/**
 * An immutable class that represents the state of the 3×3 tic-tac-toe board.
 *
 * @author Abigayle Hickey
 */

public class Board {
	 private char[][] board;
	 private Move currentMove;
	

	    /**
	     * Construct an empty board (contains all space char's).
	     */
	    public Board() {
	    		board = new char [][]
	    			{{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					{'|', ' ', ' ',' ','|', ' ', ' ',' ', '|', ' ', ' ',' ', '|'},
					{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					{'|', ' ', ' ',' ','|', ' ', ' ',' ', '|', ' ', ' ',' ', '|'},
					{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					{'|', ' ', ' ',' ','|', ' ', ' ',' ', '|', ' ', ' ',' ', '|'},
					{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}};
	    }

	    /**
	     * Given the 'other' board as a starting condition, apply the given
	     * 'move' to generate this board's state.
	     */
	    public Board(Board other, Move move) {
	    	
	    		this.board = other.board;
	    		this.currentMove = move;
	    }

	    /**
	     * Convert to a string that shows the board's state.
	     */
	    public String toString() {

	    	String string = "";
	    	for(char[] row : board) {
				for(char c : row) 
					string = string + Character.toString(c);
			}
	    	return string;
	    }
	 

	    /**
	     * Get the entry of the board at column i, row j.  Both indices should
	     * be in the range [0, 2].
	     */
	    public char get(int i, int j) {
	    	
	    	if(i == 0) {
				if(j == 0)
					return board[1][2];
			
				else if(j == 1) 
					return board[1][6];
				
				else 
					return board[1][10];
				}
			
			else if(i == 1) {
				if(j == 0)
					return board[3][2];
	
				else if(j == 1) 
					return board[3][6];
					
				else 
					return board[3][10];
				}
			
			else {
				if(j == 0) 
					return board[5][2];
				
				else if(j == 1) 
					return board[5][6];
				
				else 
					return board[5][10];
				
			}
		
		}
	    
	    public Board replace() {
	    	if(currentMove.getI() == 0) {
					if(currentMove.getJ() == 0)
						board[1][2] = currentMove.getPiece();
				
					else if(currentMove.getJ() == 1) 
						board[1][6] = currentMove.getPiece();
					
					else 
						board[1][10] = currentMove.getPiece();
					}
				
				else if(currentMove.getI() == 1) {
					if(currentMove.getJ() == 0)
						board[3][2] = currentMove.getPiece();
		
					else if(currentMove.getJ() == 1) 
						board[3][6] = currentMove.getPiece();
						
					else 
						board[3][10] = currentMove.getPiece();
					}
				
				else {
					if(currentMove.getJ() == 0) 
						board[5][2] = currentMove.getPiece();
					
					else if(currentMove.getJ() == 1) 
						board[5][6] = currentMove.getPiece();
					
					else 
						board[5][10] = currentMove.getPiece();
					
				}
	    	return this;
	    }
			
	    
	    /**
	     * @return true if there remain no empty spots on the board.
	     */
	    public boolean isFull() {
			//iterating through values: x[1, 3, 5] and y[2, 6, 10]
			for(int x=1; x<6; x=x+2) {
				for(int y=2; y<11; y=y+4) {
					if(board[x][y] == ' ')
						return false;
				}
			}
			return true;
	    }
	    
	    public GameStatus checkWinner() {
	    	if(board[1][2] == 'X' && board[1][6] == 'X' && board[1][10] == 'X')
				return GameStatus.X_WON;
			else if(board[3][2] == 'X' && board[3][6] == 'X' && board[3][10] == 'X')
				return GameStatus.X_WON;
			else if(board[5][2] == 'X' && board[5][6] == 'X' && board[5][10] == 'X')
				return GameStatus.X_WON;
			else if(board[1][2] == 'X' && board[3][2] == 'X' && board[5][2] =='X')
				return GameStatus.X_WON;
			else if(board[1][6] == 'X' && board[3][6] == 'X' && board[5][6] == 'X')
				return GameStatus.X_WON;
			else if(board[1][10] == 'X' && board[3][10] == 'X' && board[5][10] == 'X')
				return GameStatus.X_WON;
			else if(board[1][2] == 'X' && board[3][6] == 'X' && board[5][10] == 'X')
				return GameStatus.X_WON;
			
			else if(board[1][2] == 'O' && board[1][6] == 'O' && board[1][10] == 'O')
				return GameStatus.O_WON;
			else if(board[3][2] == 'O' && board[3][6] == 'O' && board[3][10] == 'O')
				return GameStatus.O_WON;
			else if(board[5][2] == 'O' && board[5][6] == 'O' && board[5][10] == 'O')
				return GameStatus.O_WON;
			else if(board[1][2] == 'O' && board[3][2] == 'O' && board[5][2] =='O')
				return GameStatus.O_WON;
			else if(board[1][6] == 'O' && board[3][6] == 'O' && board[5][6] == 'O')
				return GameStatus.O_WON;
			else if(board[1][10] == 'O' && board[3][10] == 'O' && board[5][10] == 'O')
				return GameStatus.O_WON;
			else if(board[1][2] == 'O' && board[3][6] == 'O' && board[5][10] == 'O')
				return GameStatus.O_WON;
			
			else if(isFull()) 
				return GameStatus.DRAW;
			
			else
				return GameStatus.IN_PROGRESS;
	    }
	    

}
