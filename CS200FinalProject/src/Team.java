/*
 	A team class that uses the OffensivePlays and DefensivePlays interface.
 	The teams instantiated in the Game class are objects of this class
 	
 */
public class Team implements OffensivePlays, DefensivePlays {

	public boolean hasBall = false;
    public int currentSpot = 50;
    public int firstDownSpot = currentSpot + 10;
	public int yardsGained;
	public int nextSpot = currentSpot + yardsGained;
	
	
	public Team() {
		
	}
	
	public void resetStart() {
		currentSpot = 50;
	}
				//INTERFACE LOGIC WITH OVERRIDDEN METHODS
	  //OFFENSIVE PLAYS
	// Rush Play Logic
	@Override
    public void rushPlay(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +5;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " gained 5 yards and is now on the " + nextSpot + " yard line" + "\n");
    	//nextSpot += yardsGained;
    	//return("The" + team + " is now on the " + nextSpot + " yard line");
    	//Game.yardsGained = 5;
    }
    // Pass Play logic
	@Override
    public void passPlay(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +10;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " gained 10 yards and is now on the " + nextSpot + " yard line" + "\n");
    	//Game.yardsGained = 10;
		
    }
    // Play Action Logic
	@Override
    public void playAction(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +8;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + "chose " + oppPlayChoice + "! The " + team + " gained 8 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    // Hail Mary Logic
	@Override
    public void hailMary(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +30;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + "chose " + oppPlayChoice + "! The " + team + " gained 30 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    // Bootleg Play Logic
	@Override
    public void bootlegPass(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +5;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + "chose " + oppPlayChoice + "! The " + team + " gained 5 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    
    //DEFENSIVE PLAYS
 // Blitz play
	@Override
    public void blitz(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -5;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 5 yards and is now on the " + nextSpot + " yard line" + "\n");
    }
    // Pass Defense
	@Override
    public void passDefense(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -10;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 10 yards and is now on the " + nextSpot + " yard line" + "\n");
    }
    // Zone Coverage
	@Override
    public void zoneCoverage(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -7;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 7 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    // Man to Man Coverage
	@Override
    public void manToManCoverage(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -2;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 2 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    // Stunts
	@Override
    public void stunts(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -3;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 3 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
}
