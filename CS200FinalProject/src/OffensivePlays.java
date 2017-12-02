/* 
 * 			OFFENSIVE PLAYS INTERFACE
 * 
 * This interface includes legitimate Offensive Plays that we have 
 * made available to use. Each play contains the attributes that
 * must be present in the play logic to exist. The logic for these
 * plays is implemented in the Offense Class
 */
public interface OffensivePlays {

	public void rushPlay(String team, String user, String team2);
	public void passPlay(String team, String user, String team2);
	public void playAction(String team, String user, String team2);
	public void hailMary(String team, String user, String team2);
	public void bootlegPass(String team, String user, String team2);
}
