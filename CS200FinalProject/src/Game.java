import java.util.Random;
import java.util.Scanner;

public class Game {

	public int currentSpot = 50;
	public String choice;
	public String defensiveChoice;
	Scanner scanner = new Scanner(System.in);
	boolean playing = true;
	Integer choice1 = null;
	Integer choice2 = null;
	int currentDown = 0;
	public int firstDownSpot = currentSpot + 10;
	public int yardsGained;
	public int nextSpot = currentSpot + yardsGained;
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
		
		
		if(coinToss == call1) {
			DallasO.hasBall = true;
			System.out.println("You chose " + call + " and it was " + result + ", you get the ball first at the 50!");
		}
		else {
			PhillyO.hasBall = true;
			System.out.println("You chose " + call + " and it was " + result + ", the Eagles get the ball first at the 50!");
		}
		do {
		if(DallasO.hasBall) {
				do {
					if(currentDown >= 4) {
						System.out.println("You couldn't convert on 4th down and turned the ball over. \n");
						currentDown = 0;
						DallasO.hasBall = false;
						PhillyO.hasBall = true;
						this.currentSpot = 50;
						break;
					}
					currentDown++;
					System.out.println("It is now " + currentDown +" down for the Cowboys.");
					System.out.println("Pick a play between rush or pass");
					//Player
					choice = scanner.next();
					choice = choice.toLowerCase();
					//Computer
					Random rand = new Random();
					Integer compChoice = rand.nextInt(5) + 1;
					String comp = null;
					if(compChoice == 1) {
						comp = "Blitz";
					}
					if(compChoice == 2){
						comp = "Pass Defense";
					}
					if(compChoice == 3) {
						comp = "Stunts";
					}
					if(compChoice == 4) {
						comp = "Stunts";
					}
					if(compChoice == 5) {
						comp = "Stunts";
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
						yardsGained = PhillyD.blitz(yardsGained);
						nextSpot += yardsGained;
						System.out.println("You are now on the " + nextSpot + " yard line");
						yardsGained = 0;
						
					}
					if(choice1 == 1 && compChoice == 2) {
						System.out.println("The computer chose " + comp +" and you chose a rush! You gained yards.");
						yardsGained = DallasO.rushPlay(yardsGained);
						nextSpot += yardsGained;
						System.out.println("You are now on the " + nextSpot + " yard line");
						yardsGained = 0;
		
					}
					if(choice1 == 2 && compChoice == 2) {
						System.out.println("The computer chose " + comp +" and you chose a pass! You lost yards.");
						yardsGained = PhillyD.passDefense(yardsGained);
						nextSpot += yardsGained;
						System.out.println("You are now on the " + nextSpot + " yard line");
						yardsGained = 0;
		
					}
					if(choice1 == 2 && compChoice == 1) {
						System.out.println("The computer chose " + comp +" and you chose a pass! You gained yards.");
						yardsGained = DallasO.passPlay(yardsGained);
						nextSpot += yardsGained;
						System.out.println("You are now on the " + nextSpot + " yard line");
						yardsGained = 0;
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
						firstDownSpot = currentSpot + 10;
					}
				} while(currentDown < 6);
		}
				
				if(PhillyO.hasBall) {
						do {
							if(currentDown >= 4) {
								System.out.println("You stopped the computer on this possesion and it is now your ball. \n");
								currentDown = 0;
								PhillyO.hasBall = false;
								DallasO.hasBall = true;
								DallasO.currentSpot = 50;
								break;
							}
							currentDown++;
							System.out.println("It is now " + currentDown +" down for the Eagles.");
							System.out.println("Pick a play between blitz or pass defense");
							//Player
							defensiveChoice = scanner.next();
							defensiveChoice = defensiveChoice.toLowerCase();
							//Computer
							Random rando = new Random();
							Integer compChoice2 = rando.nextInt(2) + 1;
							String comp2 = null;
							if(compChoice2 == 1) {
								comp2 = "Rush";
							}
							if(compChoice2 == 2){
								comp2 = "Pass";
							}
							
							switch(defensiveChoice) {
							case "blitz":
								choice2 = 1;
								break;
							case "passdefense":
								choice2 = 2;
								break;
							}
							if(choice2 == 1 && compChoice2 == 1) {
								System.out.println("The computer chose " + comp2 +" and you chose a blitz! The computer lost yards.");
								yardsGained = DallasD.blitz(yardsGained);
								nextSpot += yardsGained;
								System.out.println("The computer is now on the " + nextSpot + " yard line");
								yardsGained = 0;
								
							}
							if(choice2 == 1 && compChoice2 == 2) {
								/*System.out.println("The computer chose " + comp2 +" and you chose a blitz! The computer gained yards.");
								yardsGained = PhillyO.passPlay(yardsGained);
								nextSpot += yardsGained;
								System.out.println("The computer is now on the " + nextSpot + " yard line");
								yardsGained = 0;*/
								PhillyO.passPlay();
				
							}
							if(choice2 == 2 && compChoice2 == 2) {
								System.out.println("The computer chose " + comp2 +" and you chose pass defense! The computer lost yards.");
								yardsGained = DallasD.passDefense(yardsGained);
								nextSpot += yardsGained;
								System.out.println("The computer is now on the " + nextSpot + " yard line");
								yardsGained = 0;
				
							}
							if(choice2 == 2 && compChoice2 == 1) {
								System.out.println("The computer chose " + comp2 +" and you chose pass defense! The computer gained yards.");
								yardsGained = PhillyO.rushPlay(yardsGained);
								nextSpot += yardsGained;
								System.out.println("The computer is now on the " + nextSpot + " yard line");
								yardsGained = 0;
							}
							if(PhillyO.currentSpot >= 100) {
								System.out.println("The computer scored a touchdown! You lost the game!");
								touchdown = true;
								break;
							}
							if(PhillyO.currentSpot <= 0) {
								System.out.println("Congrats! You forced a safety, you win!");
								break;
							}
							if(PhillyO.nextSpot == PhillyO.firstDownSpot) {
								PhillyO.currentSpot = PhillyO.nextSpot;
								currentDown = 0;
								PhillyO.firstDownSpot = PhillyO.currentSpot + 10;
							}
						} while(currentDown < 6);
				}
		}while(!touchdown);
	}
}