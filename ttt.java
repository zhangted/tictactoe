package ttt;

public class ttt {

	private static String[][] board;
	private static String[] symbols = {"X", "O"};
	private static int current = 0;
	
	public ttt() {
		//create board
		board = new String[3][3];
		for(int x = 0; x < board.length; x++) {
			for(int y = 0; y < board[0].length; y++) {
				board[x][y] = " "; //empty board
			}
		}
	}
	
	public void showBoard() {
		//print out the board
		for(int x = 0; x < board.length; x++) {
			for(int y = 0; y < board.length; y++) {
				System.out.print(" | " + board[x][y]);
				if(y == board.length - 1) {
					System.out.print(" |");
					System.out.println();
				}
			}
		}
	}
	
	public int insertSymbol(String symbol, int xinp, int yinp) {
		//where does the player want to go?
		if(board[xinp][yinp] == " ") {
			board[xinp][yinp] = symbol;
			return 1;
		}
		else {
			return 0;//fail
		}
	}
	
	public String currentPlayer() {
		int i = current;
		if(current == 0) {
			current = 1;
		}
		else if(current == 1) {
			current = 0;
		}
		return symbols[i];
	}
	
	public static String checkForVictory() {
		for(int x = 0; x < symbols.length; x++) {
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board.length; j++) {
					if(   board[i][0] == symbols[x] & board[i][1] == symbols[x] && board[i][2] == symbols[x] //3 in a row
					   || board[0][j] == symbols[x] && board[1][j] == symbols[x] && board[2][j] == symbols[x] //3 in a column
					   || board[0][0] == symbols[x] && board[1][1] == symbols[x] && board[2][2] == symbols[x] //diagonal
					   || board[2][0] == symbols[x] && board[1][1] == symbols[x] && board[0][2] == symbols[x]) { //diagonal
						return symbols[x];
					}
				}
			}
		}
		return "0";
	}
	
	
	
}
