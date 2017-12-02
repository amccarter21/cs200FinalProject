/*
 * 			GAME 
 * 
 * This contains the logic to run the football game
 */

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	// Attribute definitions

	//public int currentSpot = 50;
	public String choice;
	public String defensiveChoice;
	Scanner scanner = new Scanner(System.in);
	boolean playing = true;
	Integer choice1 = null;
	Integer choice2 = null;
	int currentDown = 0;
	//public int firstDownSpot = currentSpot + 10;
	//public int yardsGained;
	//public int nextSpot = currentSpot + yardsGained;
	boolean touchdown = false;
	
	// empty method declaration
	public Game() {
		
	}
	//method declaration to run the game
	public void runGame() {
		/*Offense DallasO = new Offense();
		Offense PhillyO= new Offense();
		Defense DallasD = new Defense();
		Defense PhillyD= new Defense();*/
		Team Dallas = new Team();
		Team Philly = new Team();
		String call;
		Integer call1 = null;
		Scanner beginning = new Scanner(System.in);
		
		// Coin toss
		Random coin = new Random();
		Integer coinToss = coin.nextInt(2) + 1;
		String result = coinToss.toString();
		if(coinToss == 1) {
			result = "Heads";
		}
		else {
			result ="Tails";
		}
		//Ask the player pick between heads or tells for the coin toss to start the game
		System.out.println("To choose who starts with the ball, pick heads or tails!");
		call = beginning.next();
		call = call.toLowerCase();
		//Take the input and turn it into an integer for logic
		switch(call) {
		case "heads":
			call1 = 1;
			break;
		case "tails":
			call1 = 2;
			break;
		}
		
		//Logic where if the cointoss is equal to the input then, the user gets the ball first
		if(coinToss == call1) {
			Dallas.hasBall = true;
			System.out.println("You chose " + call + " and it was " + result + ", you get the ball first at the 50!");
		}
		//If not, the computer gets the ball first
		else {
			Philly.hasBall = true;
			System.out.println("You chose " + call + " and it was " + result + ", the Eagles get the ball first at the 50!");
		}
		
		do {
		if(Dallas.hasBall) {
			//Start the do loop for when Dallas is on offense
				do {
					//First check is the down is over 4th Down and if so turn the ball over to Philly
					if(currentDown >= 4) {
						System.out.println("You couldn't convert on 4th down and turned the ball over. \n");
						currentDown = 0;
						Dallas.hasBall = false;
						Philly.hasBall = true;
						break;
					}
					//Add 1 to the current down and print out the header for which down it is
					currentDown++;
					System.out.println("It is now " + currentDown +" down for the Cowboys.");
					System.out.println("Pick a play between rush, pass, playaction, hailmary, or bootlegpass");
					
					//Player
					choice = scanner.next();
					choice = choice.toLowerCase();
					
					//Computer
					Random rand = new Random();
					//Have the computer randomly pick a number from 1-5 to determine the play
					Integer compChoice = rand.nextInt(5) + 1;
					//Create a string for the different choices to be able to print which choice the computer made
					String comp = null;
					if(compChoice == 1) {
						comp = "Blitz";
					}
					if(compChoice == 2){
						comp = "Pass Defense";
					}
					if(compChoice == 3) {
						comp = "Zone Coverage";
					}
					if(compChoice == 4) {
						comp = "Man to Man Coverage";
					}
					if(compChoice == 5) {
						comp = "Stunts";
					}
					//Turn the player input into integers for the game logic
					switch(choice) {
					case "rush":
						choice1 = 1;
						break;
					case "pass":
						choice1 = 2;
						break;
					case "playaction":
						choice1 = 3;
						break;
					case "hailmary":
						choice1 = 4;
						break;
					case "bootlegpass":
						choice1 = 5;
						break;
					}
					
					
					//If the player chooses a rush
					if(choice1 == 1 && compChoice == 1) {
						/*System.out.println("The computer chose " + comp +" and you chose a rush! You lost yards.");
						yardsGained = PhillyD.blitz(yardsGained);
						nextSpot += yardsGained;
						System.out.println("You are now on the " + nextSpot + " yard line");
						yardsGained = 0;*/
						Dallas.blitz("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 1 && compChoice == 2) {
						Dallas.rushPlay("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 1 && compChoice == 3) {
						Dallas.rushPlay("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 1 && compChoice == 4) {
						Dallas.rushPlay("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 1 && compChoice == 5) {
						Dallas.stunts("Cowboys", choice, "Eagles", comp);
					}
					//If the player chooses to Pass
					if(choice1 == 2 && compChoice == 1) {
						Dallas.passPlay("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 2 && compChoice == 2) {
						Dallas.passDefense("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 2 && compChoice == 3) {
						Dallas.zoneCoverage("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 2 && compChoice == 4) {
						Dallas.manToManCoverage("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 2 && compChoice == 5) {
						Dallas.passPlay("Cowboys", choice, "Eagles", comp);
					}
					//If the player chooses to Play Action
					if(choice1 == 3 && compChoice == 1) {
						Dallas.playAction("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 3 && compChoice == 2) {
						Dallas.passDefense("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 3 && compChoice == 3) {
						Dallas.zoneCoverage("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 3 && compChoice == 4) {
						Dallas.playAction("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 3 && compChoice == 5) {
						Dallas.stunts("Cowboys", choice, "Eagles", comp);
					}
					//If the player chooses to Hail Mary
					if(choice1 == 4 && compChoice == 1) {
						Dallas.hailMary("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 4 && compChoice == 2) {
						Dallas.passDefense("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 4 && compChoice == 3) {
						Dallas.hailMary("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 4 && compChoice == 4) {
						Dallas.manToManCoverage("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 4 && compChoice == 5) {
						Dallas.hailMary("Cowboys", choice, "Eagles", comp);
					}
					//If the player chooses to Bootleg Pass
					if(choice1 == 5 && compChoice == 1) {
						Dallas.bootlegPass("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 5 && compChoice == 2) {
						Dallas.bootlegPass("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 5 && compChoice == 3) {
						Dallas.zoneCoverage("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 5 && compChoice == 4) {
						Dallas.manToManCoverage("Cowboys", choice, "Eagles", comp);
					}
					if(choice1 == 5 && compChoice == 5) {
						Dallas.bootlegPass("Cowboys", choice, "Eagles", comp);
					}
					
					//Touchdown Checker
					if(Dallas.currentSpot >= 100) {
						System.out.println("You have scored a touchdown! You won the game!");
						touchdown = true;
						break;
					}
					//Safety Checker
					if(Dallas.currentSpot <= 0) {
						System.out.println("The defense took you back for a safety, you lose!");
						break;
					}
					//First Down Checker
					if(Dallas.nextSpot >= Dallas.firstDownSpot) {
						Dallas.currentSpot = Dallas.nextSpot;
						currentDown = 0;
						Dallas.firstDownSpot = Dallas.currentSpot + 10;
					}
				} while(currentDown < 6);
		}
				//Start a different loop for when Philly has the ball with the same logic
				if(Philly.hasBall) {
						do {
							if(currentDown >= 4) {
								System.out.println("You stopped the computer on this possesion and it is now your ball. \n");
								currentDown = 0;
								Philly.hasBall = false;
								Dallas.hasBall = true;
								break;
							}
							currentDown++;
							System.out.println("It is now " + currentDown +" down for the Eagles.");
							System.out.println("Pick a play between blitz, pass defense, zone, man, or stunts");
							//Player
							defensiveChoice = scanner.next();
							defensiveChoice = defensiveChoice.toLowerCase();
							//Computer
							Random rando = new Random();
							Integer compChoice2 = rando.nextInt(5) + 1;
							String comp2 = null;
							if(compChoice2 == 1) {
								comp2 = "Rush";
							}
							if(compChoice2 == 2){
								comp2 = "Pass";
							}
							if(compChoice2 == 3) {
								comp2 = "Play Action";
							}
							if(compChoice2 == 4) {
								comp2 = "Hail Mary";
							}
							if(compChoice2 == 5) {
								comp2 = "Bootleg Pass";
							}
							
							switch(defensiveChoice) {
							case "blitz":
								choice2 = 1;
								break;
							case "passdefense":
								choice2 = 2;
								break;
							case "zone":
								choice2 = 3;
								break;
							case "man":
								choice2 = 4;
								break;
							case "stunts":
								choice2 = 5;
								break;
							}
							
									// Defines the specific offense defense pairing outcomes
							//If the computer chooses to rush
							if(choice2 == 1 && compChoice2 == 1) {
								/*System.out.println("The computer chose " + comp2 +" and you chose a blitz! The computer lost yards.");
								yardsGained = DallasD.blitz(yardsGained);
								nextSpot += yardsGained;
								System.out.println("The computer is now on the " + nextSpot + " yard line");
								yardsGained = 0;*/
								Philly.blitz("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 2 && compChoice2 == 1) {
								Philly.rushPlay("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 3 && compChoice2 == 1) {
								Philly.rushPlay("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 4 && compChoice2 == 1) {
								Philly.rushPlay("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 5 && compChoice2 == 1) {
								Philly.stunts("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							//If the computer chooses to Pass
							if(choice2 == 1 && compChoice2 == 2) {
								Philly.passPlay("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 2 && compChoice2 == 2) {
								Philly.passDefense("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 3 && compChoice2 == 2) {
								Philly.zoneCoverage("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 4 && compChoice2 == 2) {
								Philly.manToManCoverage("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 5 && compChoice2 == 2) {
								Philly.passPlay("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							//If the computer chooses to Play Action
							if(choice2 == 1 && compChoice2 == 3) {
								Philly.playAction("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 2 && compChoice2 == 3) {
								Philly.passDefense("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 3 && compChoice2 == 3) {
								Philly.zoneCoverage("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 4 && compChoice2 == 3) {
								Philly.playAction("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 5 && compChoice2 == 3) {
								Philly.stunts("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							//If the computer chooses to Hail Mary
							if(choice2 == 1 && compChoice2 == 4) {
								Philly.hailMary("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 2 && compChoice2 == 4) {
								Philly.passDefense("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 3 && compChoice2 == 4) {
								Philly.hailMary("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 4 && compChoice2 == 4) {
								Philly.manToManCoverage("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 5 && compChoice2 == 4) {
								Philly.hailMary("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							//If the computer chooses to Bootleg Pass
							if(choice2 == 1 && compChoice2 == 5) {
								Philly.bootlegPass("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 2 && compChoice2 == 5) {
								Philly.bootlegPass("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 3 && compChoice2 == 5) {
								Philly.zoneCoverage("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 4 && compChoice2 == 5) {
								Philly.manToManCoverage("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							if(choice2 == 5 && compChoice2 == 5) {
								Philly.bootlegPass("Eagles", comp2, "Cowboys", defensiveChoice);
							}
							
							//Touchdown Checker
							if(Philly.currentSpot >= 100) {
								System.out.println("The computer scored a touchdown! You lost the game!");
								touchdown = true;
								break;
							}
							//Safety Checker
							if(Philly.currentSpot <= 0) {
								System.out.println("Congrats! You forced a safety, you win!");
								break;
							}
							//First Down Checker
							if(Philly.nextSpot >= Philly.firstDownSpot) {
								Philly.currentSpot = Philly.nextSpot;
								currentDown = 0;
								Philly.firstDownSpot = Philly.currentSpot + 10;
							}
						} while(currentDown < 6);
				}
		}while(!touchdown);
	}
}