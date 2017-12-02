/* 
 * 			DEFENSIVE PLAYS INTERFACE
 * 
 * This interface includes legitimate Defensive Plays that we have 
 * made available for the teams to use. Each play contains the attributes 
 * that must be present in the play logic to exist. The logic for these
 * plays is implemented in the Defense Class
 */
public interface DefensivePlays {

	public void blitz(String team, String user, String team2);
	public void passDefense(String team, String user, String team2);
	public void stunts(String team, String user, String team2);
	public void zoneCoverage(String team, String user, String team2);
	public void manToManCoverage(String team, String user, String team2);
}
