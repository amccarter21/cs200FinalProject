/*
                   RUNNING BACK SUBCLASS                                                            
 
This class contains the variable declaration, instantiation, 
 get set methods, and print info for the player being printed
 Player data is extended from subclass Offense
*/
public class RunningBack extends Offense {
    double average;
    int longest; 
    int attempts;
    
    public RunningBack(String name_, int attempts_, int yards_, double average_, int longest_, int touchdowns_){
         super (name_, yards_, touchdowns_);
         this.longest = longest_;
         this.average = average_;
         this.attempts = attempts_;
    }
    
    public RunningBack(int number_,String name_, String position_, int height_, int weight_,int age_, int experience_, String college_){
        
        super(number_, name_, position_, height_, weight_, age_, experience_, college_);
    }
    
    // Get set methods for the additional Runningback attributes outside of the super class 
      
    public double getAverage(){
        return average;
    }
    public double setAverage( double avg){
        return this.average = avg;
        
    }
    
     public int getAttempts(){
        return attempts;
    }
    public int setAttempts(int att){
        return this.attempts = att;
        
    }
    
    public int getLongest(){
        return longest;
    }
    public int setLongest(int l){
        return this.longest = l;
        
    }
    
    // PRINT PLAYER INFO
    public void printInfo(){
        super.printPlayerInfo();
        
    }
    
    String rb_format = "%20s %10s %10s %10s %10s %10s  %n";
     public void printRBHeader(){
        System.out.print("\n");
        System.out.format(player_title_position_format, "Running Back" );
        System.out.print("\n");
        System.out.format(rb_format, "Name", "ATT", "YDS", "AVG", "LNG", "TD");
    }
    
     // Overrides the super class print method for player stats
    @Override
    public void printPlayerStats(){
        System.out.format(rb_format, this.name, this.attempts, this.yards, this.average, this.longest, this.touchdowns);
        System.out.print("\n");
    }
    
}
