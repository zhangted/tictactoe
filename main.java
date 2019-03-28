package ttt;
import java.util.Scanner;

public class main {

	public static void main(String[] args) { 

		ttt game = new ttt(); //create board 
		
		Scanner scan = new Scanner(System.in); //Get ready to record inputs	
		
		while(ttt.checkForVictory() == "0") { 
			
			int[] vars = new int[2];
			
			String currentPlayer = game.currentPlayer();
			System.out.println("Player '" + currentPlayer + "', enter where you want to go (format:1 2 or 2 2 or 0 1): ");
			for(int i = 0; i < vars.length; i++) { 
				vars[i] = scan.nextInt(); 
			}
			
			if(game.insertSymbol(currentPlayer, vars[0], vars[1]) == 1) {
				
			}
			else {//fail to insert 
				System.out.println("Spot already taken!");
				break;
			}
			game.showBoard();
			
		}
		
		System.out.println("'" + ttt.checkForVictory() + "' won!");
		
		scan.close();
		
	}

}
