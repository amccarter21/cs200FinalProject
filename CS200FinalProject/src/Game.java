import java.util.Random;
import java.util.Scanner;

public class Game {

	public static int gameYards = 50;
	public String choice;
	Scanner scanner = new Scanner(System.in);
	boolean playing = true;
	Integer choice1 = null;
	int currentDown = 1;
	boolean touchdown = false;
	boolean hasBall = false;
	
	public Game() {
		
	}
	
	public void runGame() {
		Offense DallasO = new Offense();
		Offense PhillyO= new Offense();
		Defense DallasD = new Defense();
		Defense PhillyD= new Defense();
		
		do {
			System.out.println("Pick a play between rush or pass");
			//Player
			choice = scanner.next();
			choice = choice.toLowerCase();
			//Computer
			Random rand = new Random();
			Integer compChoice = rand.nextInt(2) + 1;
			String comp = null; //= compChoice.toString();
			if(compChoice == 1) {
				comp = "Blitz";
			}
			if(compChoice == 2){
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
				System.out.println("The computer chose " + comp +" and you chose a rush! You lost yards.");
				PhillyD.blitz();
				System.out.println("You are now on the " + gameYards + " yard line");
				
			}
			if(choice1 == 1 && compChoice == 2) {
				System.out.println("The computer chose " + comp +" and you chose a rush! You gained yards.");
				DallasO.rushPlay();
				System.out.println("You are now on the " + gameYards + " yard line");

			}
			if(choice1 == 2 && compChoice == 2) {
				System.out.println("The computer chose " + comp +" and you chose a pass! You lost yards.");
				PhillyD.passDefense();
				System.out.println("You are now on the " + gameYards + " yard line");

			}
			if(choice1 == 2 && compChoice == 1) {
				System.out.println("The computer chose " + comp +" and you chose a pass! You gained yards.");
				DallasO.passPlay();
				System.out.println("You are now on the " + gameYards + " yard line");
			}
			if(gameYards >= 100) {
				System.out.println("You have scored a touchdown! You won the game!");
				touchdown = true;
			}
			if(gameYards <= 0) {
				System.out.println("The defense took you back for a safety, you lose!");
				break;
			}
		} while(!touchdown);
	}
	
}
