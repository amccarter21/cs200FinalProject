/*
 * 			OFFENSE
 * This is the superclass Offense that extends to the subclass of 
 * Offensive Players . Within this class is the logic for the print info for the player
 * and the associated headers. This class also implements the DefensivePlays interface
 * The logic for the methods brought over from that interface include the logic
 * for the plays available to the player/computer when it is their turn.
 * Method declaration for the interface exists in public void format to meet the 
 * requirements of java interfacing
 */
public class Offense implements OffensivePlays {
  
    
    // defines the variable name, position, and team;
    int number;
    String name;
    String position;
    String team;
    int height;
    int weight;
    int age;
    int experience;
    String college;
    int touchdowns;
    int yards;
    boolean hasBall = false;
    public int currentSpot = 50;
    public int firstDownSpot = currentSpot + 10;
	public int yardsGained;
	public int nextSpot = currentSpot + yardsGained;
    
/*		OFFENSE METHOD DECLARATION
* This section of the code contains methods instantiating the variables combined above.
* I am expecting to use multiple scenarios of the Offense to display player data, so 
* have several methods. The first being a blank constructor. The others being a calling
* card type output, player physical data, and lastly current season data*/
    
// blank constructor
   public Offense() {
       
   }
   
   public Offense(String name_){
       this.name = name_;
   }
   public Offense(String name_, int yards_, int touchdowns_){
       this.name = name_;
       this.yards = yards_;
       this.touchdowns = touchdowns_;
   }
// This instantiates a layout of player data from this season
    public Offense( int number_,String name_, String position_, String team_, int attempts_, int yards_, int touchdowns_){
        this.number = number_;
        this.name = name_;
        this.position = position_;
        this.team = team_;
        this.yards = yards_;
        this.touchdowns = touchdowns_;
    }
// Player non-stats data
    public Offense(int number_,String name_, String position_, int height_, int weight_,int age_, int experience_, String college_){
        this.number = number_;
        this.name = name_;
        this.position = position_;
        this.height = height_;
        this.weight = weight_;
        this.age = age_;
        this.experience = experience_;
        this.college = college_;
       
    }
// player current season stats
    public Offense(int number_,String name_, String position_ ,int yards_, int touchdowns_){
        this.number = number_;
        this.name = name_;
        this.position = position_;
        this.yards = yards_;
        this.touchdowns = touchdowns_;
    }
    

// GET SET METHODS FOR ALL OF THE ATTRIBUTE DATA//
    
    public int getNumber(){
        return number;
    }
    public int setNumber(int num_){
        return this.number = num_;
        
    }
    
    public String getName(){
        return name;
    }
    public String setName(String name_){
        return this.name = name_;
        
    }
    
    public String getPosition(){
        return position;
    }
    public String setPosition(String position_){
        return this.position = position_;
        
    }
      
    public String getTeam(){
        return team;
    }
    public String setTeam(String team_){
        return this.team = team_;
        
    }
    
    public int getHeight (){
        return height;
    }
    public int setHeight (int h){
        return this.height = h;
        
    }
    
    public int getWeight (){
        return weight;
    }
    public int setWeight (int w){
        return this.weight = w;
        
    }
    
    public int getAge(){
        return age;
    }
    public int setAge( int a){
        return this.age = a;
        
    }
    
    public int getExperience(){
        return experience;
    }
    public int setExperience(int exp){
        return this.experience = exp;
        
    }
    
    public String getCollege(){
        return college;
    }
    public String setCollege(String college_){
        return this.college = college_;
        
    }
    
    public int getTouchdowns(){
        return touchdowns;
    }
    public int setTouchdowns( int td){
        return this.touchdowns = td;
       
    }
    
    public int getYards(){
        return yards;
    }
    public int setYards(int y){
        return this.yards = y;
        
    }
    
    // 		INTERFACE LOGIC
    // Rush Play Logic
    public void rushPlay(String team, String comp2, String opponent) {
    	yardsGained = yardsGained +5;
    	System.out.println("The" + team + " chose " + comp2 +" and the " + opponent + "chose pass defense! The " + team + "gained yards.");
    	nextSpot += yardsGained;
    	System.out.println("The" + team + " is now on the " + nextSpot + " yard line");
		yardsGained = 0;
    	//Game.yardsGained = 5;
    }
    // Pass Play logic
    public void passPlay(String team, String comp2, String opponent) {
    	yardsGained = yardsGained +10;
    	System.out.println("Th " + team + " chose " + comp2 +" and the " + opponent + "chose pass defense! The " + team + "gained yards.");
    	nextSpot += yardsGained;
    	System.out.println("The" + team + " is now on the " + nextSpot + " yard line");
		yardsGained = 0;
    	//Game.yardsGained = 10;
		
    }
    // Play Action Logic
    public void playAction(String team, String comp2, String opponent) {
    	yardsGained = yardsGained +8;
    	System.out.println("The" + team + " chose " + comp2 +" and the " + opponent + "chose pass defense! The " + team + "gained yards.");
    	nextSpot += yardsGained;
    	System.out.println("The" + team + " is now on the " + nextSpot + " yard line");
		yardsGained = 0;
    	
    }
    // Hail Mary Logic
    public void hailMary(String team, String comp2, String opponent) {
    	yardsGained = yardsGained +30;
    	System.out.println("The" + team + " chose " + comp2 +" and the " + opponent + "chose pass defense! The " + team + "gained yards.");
    	nextSpot += yardsGained;
    	System.out.println("The" + team + " is now on the " + nextSpot + " yard line");
		yardsGained = 0;
    	
    }
    // Bootleg Play Logic
    public void bootlegPass(String team, String comp2, String opponent) {
    	yardsGained = yardsGained +5;
    	System.out.println("The" + team + " chose " + comp2 +" and the " + opponent + "chose pass defense! The " + team + "gained yards.");
    	nextSpot += yardsGained;
    	System.out.println("The" + team + " is now on the " + nextSpot + " yard line");
		yardsGained = 0;
    	
    }
    
    
    
// 				PRINT INFO 
 // Formating for the output including both headers and the data
    String header_title_format = "%90s %n ";
    String player_title_position_format = "%30s %n";
    String player_data_format  = "%10s %23s %15s %15s %15s %10s %15s %20s \n";

    public void printHeader(){
        System.out.format(header_title_format,"Dallas Cowboys 2017 Offense");
        System.out.print("\n");
        System.out.format(player_data_format, "Number", "Name", "Position", "Height", "Weight", "Age", "Seasons", "College" );
        
    }
    public void printPhillyHeader(){
        System.out.print("\n \n");
        System.out.format(header_title_format,"Philadelphia Eagles 2017 Offense");
        System.out.print("\n");
        System.out.format(player_data_format, "Number", "Name", "Position", "Height", "Weight", "Age", "Seasons", "College" );
    }
    
    public void printPlayerInfo(){
        System.out.format(player_data_format, this.number, this.name, this.position, this.height, this.weight, this.age, this.experience, this.college );

    }
    
    public void printPlayerStats(){
        System.out.format(header_title_format, "Offense Player Stats");
        String line_format = "%5s %5s %5s %5s %5s %5s \n";
        System.out.format(line_format, this.number, this.name, this.position, this.yards, this.touchdowns);
    }
}
