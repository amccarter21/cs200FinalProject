
public class Team implements OffensivePlays, DefensivePlays {

	public boolean hasBall = false;
    protected int currentSpot = 50;
    protected int firstDownSpot = currentSpot + 10;
	protected int yardsGained;
	protected int nextSpot = currentSpot + yardsGained;
	
	
	public Team() {
		
	}
	
				//INTERFACE LOGIC
	  //OFFENSIVE PLAYS
	// Rush Play Logic
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
    public void passPlay(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +10;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " gained 10 yards and is now on the " + nextSpot + " yard line" + "\n");
    	//Game.yardsGained = 10;
		
    }
    // Play Action Logic
    public void playAction(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +8;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + "chose " + oppPlayChoice + "! The " + team + " gained 8 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    // Hail Mary Logic
    public void hailMary(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +30;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + "chose " + oppPlayChoice + "! The " + team + " gained 30 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    // Bootleg Play Logic
    public void bootlegPass(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained +5;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + "chose " + oppPlayChoice + "! The " + team + " gained 5 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    
    //DEFENSIVE PLAYS
 // Blitz play
    public void blitz(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -5;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 5 yards and is now on the " + nextSpot + " yard line" + "\n");
    }
    // Pass Defense
    public void passDefense(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -10;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 10 yards and is now on the " + nextSpot + " yard line" + "\n");
    }
    // Zone Coverage
    public void zoneCoverage(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -7;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 7 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    // Man to Man Coverage
    public void manToManCoverage(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -2;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 2 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
    // Stunts
    public void stunts(String team, String playChoice, String opponent, String oppPlayChoice) {
    	yardsGained = yardsGained -3;
    	nextSpot += yardsGained;
    	yardsGained = 0;
    	System.out.print("The " + team + " chose " + playChoice +" and the " + opponent + " chose " + oppPlayChoice + "! The " + team + " lost 3 yards and is now on the " + nextSpot + " yard line" + "\n");
    	
    }
}
