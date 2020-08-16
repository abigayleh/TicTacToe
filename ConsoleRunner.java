/**
 * ConsoleRunner:  Prompts the user to determine the parameters of the Game
 * constructor.  Creates a Game and manages the alternating calls to the
 * ‘place’ methods in Game.  Prompts the user for inputs and outputs the state
 * of the board to the console.
 *
 * @author Abigayle Hickey
 */

import java.util.Scanner;

public class ConsoleRunner {
	 /**
     * Should the human player be the X?  Note that X always
     * goes first.
     */
    private boolean playerIsX;
    private boolean hard;
    private Game game;
    
    // Use to process text input from the user.
    private Scanner scanner = new Scanner(System.in);
    private Scanner scan = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);

    /**
     * Constructor
     */
    public ConsoleRunner() {    
    }

    /**
     * Enter the main control loop which returns only at the end of the game
     * when one party has won or there has been a draw.
     */
    public void mainLoop() {
    	
    	System.out.println("Welcome to Tic Tac Toe! Player start");
		System.out.println(" ");
		
		System.out.println("Would you like to play as X or O?");
		playerIsX = scanner.hasNext("X");
		System.out.println(" ");
		
		System.out.println("Which difficulty would you like to play? [Easy/Hard]");
		hard = scanner2.hasNext("Hard");
		
		game = new Game(playerIsX, true);
		
    	while(true) {
    		
        	if(playerIsX == false) {
    			
    			char piece = 'O';
    			
    			if(hard) {
    				//AI goes first
        			System.out.println("AI turn");
        			SmartAI ai = new SmartAI(playerIsX);
        			Move move = ai.chooseMove(game.getBoard());
        			
        			Board board = new Board(game.getBoard(), move);
        			board = board.replace();
        			
        			System.out.println();
        			game.printGameBoard();
        			
        			game.gameStatus(board);
        			if(game.gameOver())
        				break;
        			
        			//Player play
        			System.out.println();
        			System.out.println("Player turn");
        			System.out.println("Enter desired x-coordinate [0-2]");
        			
        			int Playerxpos = scan.nextInt();
        			System.out.println("Enter desired y-coordinate [0-2]");
        			int Playerypos = scan.nextInt();
        			
        			while(game.placePlayerPiece(Playerxpos, Playerypos) == false) {
        				System.out.println("Invalid input");
        				System.out.println("Enter desired x-coordinate [0-2]");
        				Playerxpos = scan.nextInt();
        				System.out.println("Enter desired y-coordinate [0-2]");
        				Playerypos = scan.nextInt();
        			}
        			
        			move = new Move(Playerxpos, Playerypos, piece);
        			board = new Board(game.getBoard(), move);
        			
        			board = board.replace();
        			
        			System.out.println();
        			game.printGameBoard();
        			
        			game.gameStatus(board);
        			if(game.gameOver())
        				break;
    			}
    			
    			//Easy difficulty
    			else {
        			System.out.println("AI turn");
        			DumbAI ai = new DumbAI(playerIsX);
        			Move move = ai.chooseMove(game.getBoard());
        			
        			Board board = new Board(game.getBoard(), move);
        			board = board.replace();
        			
        			System.out.println();
        			game.printGameBoard();
        			
        			game.gameStatus(board);
        			if(game.gameOver())
        				break;
        			
        			//Player play
        			System.out.println();
        			System.out.println("Player turn");
        			System.out.println("Enter desired x-coordinate [0-2]");
        			
        			int Playerxpos = scan.nextInt();
        			System.out.println("Enter desired y-coordinate [0-2]");
        			int Playerypos = scan.nextInt();
        			
        			while(game.placePlayerPiece(Playerxpos, Playerypos) == false) {
        				System.out.println("Invalid input");
        				System.out.println("Enter desired x-coordinate [0-2]");
        				Playerxpos = scan.nextInt();
        				System.out.println("Enter desired y-coordinate [0-2]");
        				Playerypos = scan.nextInt();
        			}
        			
        			move = new Move(Playerxpos, Playerypos, piece);
        			board = new Board(game.getBoard(), move);
        			
        			board = board.replace();
        			
        			System.out.println();
        			game.printGameBoard();
        			
        			game.gameStatus(board);
        			if(game.gameOver())
        				break;
    			}
       		}
    		
    		// Player is X
    		else {
    			
    			char piece = 'X';
    			
    			if(hard) {
        			//Player play
        			System.out.println("Player turn");
        			System.out.println("Enter desired x-coordinate [0-2]");
        			
        			int Playerxpos = scan.nextInt();
        			System.out.println("Enter desired y-coordinate [0-2]");
        			int Playerypos = scan.nextInt();
        			
        			while(game.placePlayerPiece(Playerxpos, Playerypos) == false) {
        				System.out.println("Invalid input");
        				System.out.println("Enter desired x-coordinate [0-2]");
        				Playerxpos = scan.nextInt();
        				System.out.println("Enter desired y-coordinate [0-2]");
        				Playerypos = scan.nextInt();
        			}
        			
        			Move move = new Move(Playerxpos, Playerypos, piece);
        			Board board = new Board(game.getBoard(), move);
        			
        			board = board.replace();
        			
        			System.out.println();
        			game.printGameBoard();
        			
        			game.gameStatus(board);
        			if(game.gameOver())
        				break;
        			
        			System.out.println();
        			System.out.println("AI turn");
        			SmartAI ai = new SmartAI(playerIsX);
        			move = ai.chooseMove(board);
        			
        			board = new Board(board, move);
        			board.replace();
        			
        			System.out.println();
        			game.printGameBoard();
        			
        			game.gameStatus(board);
        			if(game.gameOver())
        				break;
        		}
    			
    			//Easy difficulty
    			else {
        			//Player play
        			System.out.println("Player turn");
        			System.out.println("Enter desired x-coordinate [0-2]");
        			
        			int Playerxpos = scan.nextInt();
        			System.out.println("Enter desired y-coordinate [0-2]");
        			int Playerypos = scan.nextInt();
        			
        			while(game.placePlayerPiece(Playerxpos, Playerypos) == false) {
        				System.out.println("Invalid input");
        				System.out.println("Enter desired x-coordinate [0-2]");
        				Playerxpos = scan.nextInt();
        				System.out.println("Enter desired y-coordinate [0-2]");
        				Playerypos = scan.nextInt();
        			}
        			        			
        			Move move = new Move(Playerxpos, Playerypos, piece);
        			Board board = new Board(game.getBoard(), move);
        			
        			board = board.replace();
        			
        			System.out.println();
        			game.printGameBoard();
        			
        			game.gameStatus(board);
        			if(game.gameOver())
        				break;
        			
        			System.out.println();
        			System.out.println("AI turn");
        			DumbAI ai = new DumbAI(playerIsX);
        			move = ai.chooseMove(board);
        			
        			board = new Board(board, move);
        			board.replace();
        			
        			System.out.println();
        			game.printGameBoard();
        			
        			game.gameStatus(board);
        			if(game.gameOver())
        				break;
        		}
    		}
    	}
    	
    	if(game.getStatus() == GameStatus.DRAW) 
    		System.out.println("Draw! Better luck next time");
    	else if(game.getStatus() == GameStatus.X_WON && playerIsX || game.getStatus() == GameStatus.O_WON && !playerIsX)	
    		System.out.println("Congratulations! You have won");
    	else if(game.getStatus() == GameStatus.O_WON && playerIsX || game.getStatus() == GameStatus.X_WON && !playerIsX)
			System.out.println("AI has won. Better luck next time");
    			
    }
}

