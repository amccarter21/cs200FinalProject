/*
                   OFFENSE PLAYER CLASS
 
 This class contains the variable declaration, instantiation, 
 get set methods, and print info for the player being printed
 Player data is extended from subclass Offense
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
    
// OFFENSE METHOD DECLARATION//
// This section of the code contains methods instantiating the variables combined above.
// I am expecting to use multiple scenarios of the Offense to display player data, so 
//I have several methods. The first being a blank constructor. The others being a calling
// card type output, player physical data, and lastly current season data
    
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
    public void rushPlay() {
    	Game.gameYards = Game.gameYards +5;
    }
    public void passPlay() {
    	Game.gameYards = Game.gameYards +10;
    }
    
    
    
// PRINT INFO OF THE FOOTBALL DATA
    String header_title_format = "%90s %n ";
    String player_title_position_format = "%30s %n";
    
    String player_data_format  = "%10s %23s %15s %15s %15s %10s %15s %20s \n";
    // This included the header that prints once at the beginning of running the roster
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
    // prints non stats data of the player
    public void printPlayerInfo(){
        System.out.format(player_data_format, this.number, this.name, this.position, this.height, this.weight, this.age, this.experience, this.college );

    }
    // prints the players current season data
    public void printPlayerStats(){
        System.out.format(header_title_format, "Offense Player Stats");
        String line_format = "%5s %5s %5s %5s %5s %5s \n";
        System.out.format(line_format, this.number, this.name, this.position, this.yards, this.touchdowns);
    }
}
