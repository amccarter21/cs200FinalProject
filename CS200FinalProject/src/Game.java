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
	
	public Game() {
		
	}
	
	public void runGame() {
		Offense DallasO = new Offense();
		Offense PhillyO= new Offense();
		Defense DallasD = new Defense();
		Defense PhillyD= new Defense();
		String call;
		Integer call1 = null;
		Scanner beginning = new Scanner(System.in);
		
		Random coin = new Random();
		Integer coinToss = coin.nextInt(2) + 1;
		String result = coinToss.toString();
		if(coinToss == 1) {
			result = "Heads";
		}
		else {
			result ="Tails";
		}
		
		System.out.println("To choose who starts with the ball, pick heads or tails!");
		call = beginning.next();
		call = call.toLowerCase();
		switch(call) {
		case "heads":
			call1 = 1;
			break;
		case "tails":
			call1 = 2;
			break;
		}
		
		
		if(coinToss == 1) {
			DallasO.hasBall = true;
			System.out.println("You chose " + call + " and it was " + result + ", you get the ball first!");
		}
		else {
			PhillyO.hasBall = true;
			System.out.println("You chose " + call + " and it was " + result + ", the Eagles get the ball first!");
		}
		if(DallasO.hasBall) {
			do {
				
				System.out.println("Pick a play between rush or pass");
				//Player
				choice = scanner.next();
				choice = choice.toLowerCase();
				//Computer
				Random rand = new Random();
				Integer compChoice = rand.nextInt(2) + 1;
				String comp = null;
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
	
}
