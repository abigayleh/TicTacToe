import java.util.Random;

/**
 * Realization of AI interface using strategy.
 *
 * @author Abigayle Hickey
 */

public class SmartAI implements AI {

	private Random random = new Random();
	private char aiPiece;
    
    /**
     * @param aiIsX Indicates whether the AI player's piece is
     *              the aiPiece.
     */
    public SmartAI(boolean playerIsX) {
    	if(playerIsX == true)
    		aiPiece = 'O';
    	else
    		aiPiece = 'X';
    }

    public Move chooseMove(Board board) {
    	int AIxpos = 0;
    	int AIypos = 0;
    	
    	//Will alwaOs claim middle piece of board first/if possible
    	if(board.get(1, 1) == ' ') {
    		AIxpos = 1;
    		AIypos = 1;
    	}

    	else if(board.get(0, 0) == aiPiece && board.get(1, 0) == aiPiece &&  board.get(2, 0) == ' ') {
    			AIxpos = 2;
    			AIypos = 0;
    		}
    	else if(board.get(0, 0) == aiPiece && board.get(2, 0) == aiPiece &&  board.get(1, 0) == ' ') {
    			AIxpos = 1;
    			AIypos = 0;
    		}
    	else if(board.get(1, 0) == aiPiece && board.get(2, 0) == aiPiece &&  board.get(0, 0) == ' ') {
    			AIxpos = 0;
    			AIypos = 0;
    		}
    		
    	else if(board.get(0, 1) == aiPiece && board.get(1, 1) == aiPiece &&  board.get(2, 1) == ' ') {
    			AIxpos = 2;
    			AIypos = 1;
    		}
    	else if(board.get(0, 1) == aiPiece && board.get(2, 1) == aiPiece &&  board.get(1, 1) == ' ') {
    			AIxpos = 1;
    			AIypos = 1;
    		}
    	else if(board.get(1, 1) == aiPiece && board.get(2, 1) == aiPiece &&  board.get(0, 1) == ' ') {
    			AIxpos = 0;
    			AIypos = 1;
    		}
    		
    	else if(board.get(0, 2) == aiPiece && board.get(1, 2) == aiPiece &&  board.get(2, 2) == ' ') {
    			AIxpos = 2;
    			AIypos = 2;
    		}
    	else if(board.get(0, 2) == aiPiece && board.get(2, 2) == aiPiece &&  board.get(1, 2) == ' ') {
    			AIxpos = 1;
    			AIypos = 2;
    		}
    	else if(board.get(1, 2) == aiPiece && board.get(2, 2) == aiPiece &&  board.get(0, 2) == ' ') {
    			AIxpos = 0;
    			AIypos = 2;
    		}
    		
    	else if(board.get(0, 0) == aiPiece && board.get(0, 1) == aiPiece &&  board.get(0, 2) == ' ') {
    			AIxpos = 0;
    			AIypos = 2;
    		}
    	else if(board.get(0, 0) == aiPiece && board.get(0, 2) == aiPiece &&  board.get(0, 1) == ' ') {
    			AIxpos = 0;
    			AIypos = 1;
    		}
    	else if(board.get(0, 1) == aiPiece && board.get(0, 2) == aiPiece &&  board.get(0, 0) == ' ') {
    			AIxpos = 0;
    			AIypos = 0;
    		}
    		
    	else if(board.get(1, 0) == aiPiece && board.get(1, 1) == aiPiece &&  board.get(1, 2) == ' ') {
    			AIxpos = 1;
    			AIypos = 2;
    		}
    	else if(board.get(1, 0) == aiPiece && board.get(1, 2) == aiPiece &&  board.get(1, 1) == ' ') {
    			AIxpos = 1;
    			AIypos = 1;
    		}
    	else if(board.get(1, 1) == aiPiece && board.get(1, 2) == aiPiece &&  board.get(1, 0) == ' ') {
    			AIxpos = 1;
    			AIypos = 0;
    		}
    		
    	else if(board.get(2, 0) == aiPiece && board.get(2, 1) == aiPiece &&  board.get(2, 2) == ' ') {
    			AIxpos = 2;
    			AIypos = 2;
    		}
    	else if(board.get(2, 0) == aiPiece && board.get(2, 2) == aiPiece &&  board.get(2, 1) == ' ') {
    			AIxpos = 2;
    			AIypos = 1;
    		}
    	else if(board.get(2, 1) == aiPiece && board.get(2, 2) == aiPiece &&  board.get(2, 0) == ' ') {
    			AIxpos = 2;
    			AIypos = 0;
    		}
    		
    	else if(board.get(0, 0) == aiPiece && board.get(1, 1) == aiPiece &&  board.get(2, 2) == ' ') {
    			AIxpos = 2;
    			AIypos = 2;
    		}
    	else if(board.get(0, 0) == aiPiece && board.get(2, 2) == aiPiece &&  board.get(1, 1) == ' ') {
    			AIxpos = 1;
    			AIypos = 1;
    		}
    	else if(board.get(1, 1) == aiPiece && board.get(2, 2) == aiPiece &&  board.get(0, 0) == ' ') {
    			AIxpos = 0;
    			AIypos = 0;
    		}
    		
    	else if(board.get(2, 0) == aiPiece && board.get(1, 1) == aiPiece &&  board.get(0, 2) == ' ') {
    			AIxpos = 0;
    			AIypos = 2;
    		}
    	else if(board.get(2, 0) == aiPiece && board.get(0, 2) == aiPiece &&  board.get(1, 1) == ' ') {
    			AIxpos = 1;
    			AIypos = 1;
    		}
    	else if(board.get(1, 1) == aiPiece && board.get(0, 2) == aiPiece &&  board.get(2, 0) == ' ') {
    			AIxpos = 2;
    			AIypos = 0;
    		}
    		
        //Choose random place
        else {
        	AIxpos = random.nextInt(3) + 0;
        	AIypos = random.nextInt(3) + 0;
        		
       		//Ensure random piece is available
       		while(board.get(AIxpos, AIypos) != ' ') {
       			AIxpos = random.nextInt(3) + 0;
       			AIypos = random.nextInt(3) + 0;
        	}	
       	}
    		  	
		Move move = new Move(AIxpos, AIypos, aiPiece);
		return move;	
    }
}
