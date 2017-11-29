import java.util.Random;
import java.util.Scanner;

public class Game {

	public int gameYards = 50;
	public String choice;
	Scanner scanner = new Scanner(System.in);
	boolean playing = true;
	Integer choice1 = null;
	int currentDown = 1;
	boolean touchdown = false;
	
	public Game() {
		
	}
	
	public void runGame() {
		
		while(!touchdown) {
			System.out.println("Pick a play between rush or pass");
			//Player
			choice = scanner.next();
			choice = choice.toLowerCase();
			//Computer
			Random rand = new Random();
			Integer compChoice = rand.nextInt(2);
			String comp; //= compChoice.toString();
			if(compChoice == 1) {
				comp = "Blitz";
			}
			else {
				comp = "Pass Defense";
			}
			
			switch(choice) {
			case "rush":
				choice1 = 1;
				break;
			case "pass":
				choice1 = 2;
				break;
			}
			
			if(choice1 == 1 && compChoice == 1) {
				System.out.println("The computer chose" + comp +" and you chose a rush! You lost yards.");
				gameYards = gameYards -5;
				System.out.println("You are now on the " + gameYards + "yard line");
				
			}
			if(choice1 == 1 && compChoice == 2) {
				System.out.println("You chose to run and the computer chose pass defense! You gain yards.");
				gameYards = gameYards +5;
				System.out.println("You are now on the " + gameYards + "yard line");

			}
			if(choice1 == 2 && compChoice == 2) {
				System.out.println("You chose to pass and the computer chose pass defense! You lose yards.");
				gameYards = gameYards -5;
				System.out.println("You are now on the " + gameYards + "yard line");

			}
			if(choice1 == 2 && compChoice == 1) {
				System.out.println("You chose to pass and the computer chose blitz! You gain yards.");
				gameYards = gameYards +10;
				System.out.println("You are now on the " + gameYards + "yard line");
			}
			if(gameYards >= 100) {
				System.out.println("You have scored a touchdown! You won the game!");
				touchdown = true;
			}
			if(gameYards <= 0) {
				System.out.println("The defense took you back for a safety, you lose!");
				break;
			}
		}
	}
	
}
