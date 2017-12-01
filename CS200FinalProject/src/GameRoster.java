/*
                   ROSTER PLAYER OUTPUT
 
This prints both the Dallas Cowboys and the Philadelphia Eagles
*/
public class GameRoster {
    
    public static void main(String[] args){
    	
    	RunGame game = new RunGame();
    	
    	boolean repeat = true;
    	  while (repeat)
    	  {
    	    repeat = game.mainMenu();
    	  }
    	   System.out.println("Program Exited");
    	 }

    
    }
