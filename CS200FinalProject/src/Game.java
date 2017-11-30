import java.util.Random;
import java.util.Scanner;

public class Game {

	public static int currentSpot = 50;
	public String choice;
	Scanner scanner = new Scanner(System.in);
	boolean playing = true;
	Integer choice1 = null;
	int currentDown = 0;
	public int firstDownSpot = currentSpot + 10;
	public static int yardsGained;
	public static int nextSpot = currentSpot + yardsGained;
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
			System.out.println("You chose " + call + " and it was " + result + ", you get the ball first at the 50!");
		}
		else {
			PhillyO.hasBall = true;
			System.out.println("You chose " + call + " and it was " + result + ", the Eagles get the ball first at the 50!");
		}
		if(DallasO.hasBall) {
			//for(currentDown = 1; currentDown == 6; currentDown++) {
				do {
					currentDown++;
					System.out.println("It is now " + currentDown +" down.");
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
						System.out.println("You are now on the " + nextSpot + " yard line");
						//yardsGained = 0;
						
					}
					if(choice1 == 1 && compChoice == 2) {
						System.out.println("The computer chose " + comp +" and you chose a rush! You gained yards.");
						DallasO.rushPlay();
						System.out.println("You are now on the " + nextSpot + " yard line");
						//yardsGained = 0;
		
					}
					if(choice1 == 2 && compChoice == 2) {
						System.out.println("The computer chose " + comp +" and you chose a pass! You lost yards.");
						PhillyD.passDefense();
						System.out.println("You are now on the " + nextSpot + " yard line");
						//yardsGained = 0;
		
					}
					if(choice1 == 2 && compChoice == 1) {
						System.out.println("The computer chose " + comp +" and you chose a pass! You gained yards.");
						DallasO.passPlay();
						System.out.println("You are now on the " + nextSpot + " yard line");
						//yardsGained = 0;
					}
					if(currentSpot >= 100) {
						System.out.println("You have scored a touchdown! You won the game!");
						touchdown = true;
						break;
					}
					if(currentSpot <= 0) {
						System.out.println("The defense took you back for a safety, you lose!");
						break;
					}
					if(nextSpot == firstDownSpot) {
						currentSpot = nextSpot;
						currentDown = 0;
					}
					if(currentDown > 4) {
						System.out.println("You couldn't convert on 4th down and turned the ball over.");
						break;
					}
				} while(currentDown < 6);
			//}
		}
	}
	
}
