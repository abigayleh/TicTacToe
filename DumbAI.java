/**
 * Realization of AI interface using simplistic random placement strategy.
 *
 * @author Abigayle Hickey
 */

import java.util.Random;

public class DumbAI implements AI {
	private Random random = new Random();
	private char aiPiece;
    
    /**
     * Construct a DumbAI.
     * 
     * @param aiIsX Indicates whether the AI player's piece is
     *  the 'X'.
     */
    public DumbAI(boolean aiIsX) {
    	if(aiIsX == true)
    		aiPiece = 'X';
    	else
    		aiPiece = 'O';
     
    }

    public Move chooseMove(Board board) {
		int AIxpos = random.nextInt(3) + 0;
		int AIypos = random.nextInt(3) + 0;
		
		while(board.get(AIxpos, AIypos) != ' ') {
			AIxpos = random.nextInt(3) + 0;
			AIypos = random.nextInt(3) + 0;
		}
		
		Move move = new Move(AIxpos, AIypos, aiPiece);
		return move;
		
    }

}
