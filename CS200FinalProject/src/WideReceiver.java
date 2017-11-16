/*
                  WIDE RECEIVER SUBCLASS                                                              
 
 This class contains the variable declaration, instantiation, 
 get set methods, and print info for the player being printed
 Player data is extended from subclass Offense
*/

public class WideReceiver extends Offense{
    int targets;
    int receptions;
   double average;
    int longest;
    
    public WideReceiver( String name_, int receptions_, int targets_, int yards_, double average_, int longest_, int touchdowns_){
        super( name_,  yards_, touchdowns_);
        this.average = average_;
        this.longest = longest_;
        this.targets = targets_;
        this.receptions = receptions_;
    }
    
    public WideReceiver(int number_,String name_, String position_, int height_, int weight_,int age_, int experience_, String college_){
        
        super(number_, name_, position_, height_, weight_, age_, experience_, college_);
    }
    
    public int getTargets(){
        return targets;
    }
    public int setTargets(int tgts){
        return this.targets = tgts;
        
    }
    
    public int getReceptions(){
        return receptions;
    }
    public int setReceptions(int rec){
        return this.receptions = rec;
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
    
    // PRINT INFO
    // Two separate print info methods for both the basic player info
    // and their 2017 season stats. Will be called four times, two for the
    // the Dallas Cowboys, and two for the ........................
    public void printInfo(){
        super.printPlayerInfo();
        
    }
    String wr_format = "%20s %10s %10s %10s %10s %10s %10s %n";
    public void printWRHeader(){
        System.out.format(player_title_position_format, "Wide Receivers" );
        System.out.print("\n");
        System.out.format(wr_format, "Name", "REC", "TGTS", "YDS", "AVG", "LNG", "TD");
    }
    // Overrides the super class print method for player stats
    @ Override
    public void printPlayerStats(){
        System.out.format(wr_format, this.name, this.receptions, this.targets, this.yards, this.average, this.longest, this.touchdowns);
       
    }
}
