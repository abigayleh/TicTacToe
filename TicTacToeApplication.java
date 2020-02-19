import java.util.Scanner;

/**
 * Contains the main method. Creates a ConsoleRunner and then calls its
 * mainLoop method.
 *
 * @author Abigayle Hickey
 */

public class TicTacToeApplication {

	public static void main(String[] args) {

		while(true) {
		Scanner start = new Scanner(System.in);
		System.out.println("Would you like to play a game of Tic Tac Toe? [Yes or No]");
		boolean game = start.hasNext("Yes");
		
			if(game) {
			ConsoleRunner console = new ConsoleRunner();
			console.mainLoop();
			}
		}
		
	}
}
