/**
 * Represents the logic of the game in terms of detecting wins or draws.  Also
 * places new pieces for the human player or AI.
 *
 * @author Abigayle Hickey
 */

public class Game {
	private Board board = new Board();
    private GameStatus status;
    private AI ai;

    /**
     * Construct a new Game according to the given parameters.
     */
    public Game(boolean playerIsX, boolean challenging) {
    		
    		
    }

    /**
     * Return a copy of the board's current contents.
     */
    public Board getBoard() {
    	return board;
    }

    /**
     * Get the game's status.
     */
    public GameStatus getStatus() {
       return status;
    }
    
    /**
     * Place a piece for the player on the board.
     * @param i i-coordinate of desired position.
     * @param j j-coordinate of desired position
     * @return true only if the coordinates of the desired position are in
     * range and the corresponding cell is empty.
     *
     * @precondition status == IN_PROGRESS
     *
     */
    public boolean placePlayerPiece(int i, int j) {
    	if(i <= 2 || i >= 0 && j <= 2 || j >= 0) {
			if(board.get(i, j) == ' ')
				return true;		
    	}
    	
    	return false;
    }

    /**
     * @precondition status == IN_PROGRESS
     */
    public void aiPlacePiece() {
    	
    	ai.chooseMove(board);
    	
    }
    
    
    public void gameStatus(Board board) {
    	status = board.checkWinner();
    }
    
    public boolean gameOver() {
    	if(status == GameStatus.IN_PROGRESS)
    		return false;
    	else
    		return true;
    }
    
  	public void printGameBoard() {
  		String string = board.toString();
  		int x = 0;
  		int y = 12;
			while(y <= string.length()) {
					System.out.print(string.substring(x, y));
					x = x+13;
					y = y+13;
					System.out.println();
				}
			}

}
