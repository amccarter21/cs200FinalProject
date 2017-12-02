/*
 * 			RUN GAME MEHTOD
 *	This is logic for running the menu. It takes input from the
 *	user and outputs either the Dallas roster, Philadelphia roster, 
 *  or the game.
 */


import java.util.Scanner;

public class RunGame {
	public boolean repeat;
	
	
	//input for the mainMenu
	public boolean mainMenu(){
	     System.out.println("Please enter the letter of your desired choice");
	       
	     Scanner scan = new Scanner(System.in);
	     boolean notValid = false;
	     
	     while(!notValid){
	       System.out.println(menuString());
	       String input = scan.nextLine();
	       
	       notValid = getMenuSelection(input);
	       
	       // condition when the user enters a value outside of what is allowed 
	       if (notValid){ break; }
	       
	       System.out.println("Re-enter a valid menu option");
	     }
	     
	     return this.repeat;
	   }
	   
	// 		MENU Logic
	   public String menuString(){
	     return " *************************************** \n"
	    		 +" * Dallas Cowboys vs Philadelphia Eagles * \n"
	    		 +" * (P)hiladelphia Roster             * \n"
	    		 +" * (D)allas Game Roster              * \n"
	    		 +" * (PP)lay as the Dallas Cowboys     * \n"
	    		 +" ***********************************";
	   }
	   
	   // method that validates the input characters
	   public boolean getMenuSelection(String input){
		   
		   repeat = true;
	     input = input.toUpperCase(); // in case the value is input as a lower case
	  // when D is selected
	     if (input.equals("D")){ 
	    	 Dallas_Roster r = new Dallas_Roster();
	         r.runDallasRoster();
	         return true;
	     }
	     // when P is selected
	     else if (input.equals("P")){
	    	 Philadelphia_Roster p = new Philadelphia_Roster();
	         p.runPhiladelphiaRoster();
	         return true;
	     }
	     // when PP is selected
	     else if (input.equals("PP")){
	    	 Game CvE = new Game();
	    	 CvE.runGame();
	    	 return true; 
		     }
	  
	     else{
	       return false;
	     }
	   }

}
