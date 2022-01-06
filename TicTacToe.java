import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	// Instance variables
	String board[] = {"1","2","3","4","5","6","7","8","9"};
	Random random = new Random();
	boolean continueGame = true;
	int numberofPlay;
	int palyNumber;
	int outoPlayer;
	String winner = "NO";
	
	// Constructor
	public TicTacToe() {
		play();
		
	}
	
	public void check() {
		if( (board[0] == "X" && board[1] == "X" && board[2] == "X") || (board[3] == "X" && board[4] == "X" && board[5] == "X") || (board[6] == "X" && board[7] == "X" && board[8] == "X") || (board[0] == "X" && board[3] == "X" && board[6] == "X") || (board[1] == "X" && board[4] == "X" && board[7] == "X") || (board[2] == "X" && board[5] == "X" && board[8] == "X") || (board[0] == "X" && board[4] == "X" && board[8] == "X") || (board[2] == "X" && board[4] == "X" && board[6] == "X") ) {
			continueGame = false;
			winner = "YOU!!";
		} else if ((board[0] == "O" && board[1] == "O" && board[2] == "O") || (board[3] == "O" && board[4] == "O" && board[5] == "O") || (board[6] == "O" && board[7] == "O" && board[8] == "O") || (board[0] == "O" && board[3] == "O" && board[6] == "O") || (board[1] == "O" && board[4] == "O" && board[7] == "O") || (board[2] == "O" && board[5] == "O" && board[8] == "O") || (board[0] == "O" && board[4] == "O" && board[8] == "O") || (board[2] == "O" && board[4] == "O" && board[6] == "O")){
			continueGame = false;
			winner = "the laptop ):";
		}
		
	}
	
	public void display1() {
		
		for(int i = 0; i<board.length;i++) {
			System.out.print(" | " );
			System.out.print(board[i] + " | " );
			if(i == 2 || i ==5 || i == 8) {
				System.out.println("");
				System.out.println("----------------------");
			}
		}
		
	}
	public void changeMatrix() {
		
		if (numberofPlay % 2 == 0) {
			board[palyNumber-1] = "X";
		
		} else {
			board[outoPlayer] = "O";
			
			
		}
		
		
	}
	public void playUser() {
		
		System.out.println("X player");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		palyNumber = input.nextInt();
		while(board[palyNumber-1] == "X" || board[palyNumber-1] == "O") {
			System.out.println("Try again: ");
			System.out.println("Enter your number: ");
			palyNumber = input.nextInt();
			
		}
	}
	
	public void playlap() {
		System.out.println("O player");
		outoPlayer = random.nextInt(9);
		while (board[outoPlayer] == "X" || board[outoPlayer] == "O" ) {
			System.out.println(outoPlayer);
			outoPlayer = random.nextInt(9);
			if(board[0] != "1" && board[1] != "2" && board[2] != "3" && board[2] != "4" && board[4] != "5"  && board[5] != "6") {
				continueGame = false;
				break;
		}
		}
		
	}
	public void play() {

		while(continueGame) {
			display1();
			
			if (numberofPlay % 2 == 0) {
				playUser();
			} else {
				playlap();
			}
			// change the matrix
			changeMatrix();
			// Check the winner
			check();
			
			System.out.println("------------------------------------------");
			numberofPlay++;
		}
		if(winner == "NO")
			System.out.print("No winner in this game");
		else
		System.out.print("THE WINNER IS " + winner);
		
		
	}
	
	
	
}
