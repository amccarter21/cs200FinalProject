/*
                   QUARTERBACK SUBCLASS                                                           
 
This class contains the variable declaration, instantiation, 
 get set methods, and print info for the player being printed
 Player data is extended from subclass Offense
*/
public class Quarterback extends Offense{
    
   
    double rating;
    int interceptions;
    int completions;
    int attempts;
    double completion_percent;
    double average;
    int longest;

// instantiates all attributes of the quarterback 
    public Quarterback(int number_ ,String name_, String position_, int height_, int weight_,int age_, int experience_, String college_){
        super (number_, name_, position_, height_, weight_, age_, experience_, college_);
    }
    
    public Quarterback( String name_, int completions_, int attempts_, int yards_, double completion_percent_, double average_, int longest_, int touchdowns_, int interceptions_, double rating_){
        super(name_,yards_, touchdowns_);
        this.interceptions = interceptions_;
        this.rating = rating_;
        this.attempts = attempts_;
        this.completions = completions_;
        this. completion_percent = completion_percent_;
        this.average = average_;
        this.longest = longest_;
        
    }
    // get set data for additional attributes outside of the offense super class
    public double getRating(){
        return rating;
    }
    
    public double setRating( double r){
        return this.rating = r;
    }
    
    public int getInterceptions(){
        return interceptions;
    }
    public int setInterceptions(int inter_){
        return this.interceptions = inter_;
        
    }
    
    public int getAttempts(){
        return attempts;
    }
    public int setAttempts(int att){
        return this.attempts = att;
        
    }
    
    public int getCompletions(){
        return completions;
    }
    public int setCompletions( int comp){
        return this.completions = comp;
    }
    
    public double getCompletionPer(){
        return completion_percent;
    }
    public double getCompletionPer( double comp_p){
        return this.completion_percent = comp_p;
                
    }
    
    public double getAverage(){
        return average;
        
    }
    public double setAverage( double avg){
        return this.average = avg;
    }
    
    public int getLongest(){
        return longest;
    }
    public int setLongest( int lng){
        return this.longest = lng;
    }
    
    // print info method
    public void printInfo(){
        super.printPlayerInfo();
    }

    // Overrides the super class print method for player stats
   String qb_stats_format = "%20s %10s %10s %10s %10s %10s %10s %10s %10s %10s %n";
   public void printPlayerHeader(){
       System.out.print("\n");
       System.out.format(player_title_position_format, "Quaterback" );
       System.out.print("\n");
       System.out.format(qb_stats_format, "Name", "CMP", "ATT", "YDS", "CMP%", "AVG", "TD", "LNG", "INT", "RAT");
   }
     @Override
    public void printPlayerStats(){        
        System.out.format(qb_stats_format, this.name, this.completions, this.attempts, this.yards, this.completion_percent, this.average, this.longest, this.touchdowns, this.interceptions, this.rating);
        System.out.print("\n");
    }
}
