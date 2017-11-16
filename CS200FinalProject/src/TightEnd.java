/*
                   TIGHT END SUBCLASS
 
 This class contains the variable declaration, instantiation, 
 get set methods, and print info for the player being printed
 Player data is extended from subclass Offense
*/
public class TightEnd extends Offense {
    
    int fumbles;
    int fumbles_lost;
    int receptions;
    double average;
    int targets;
    int longest;
    int firstDowns;
    
    public TightEnd( String name_, int receptions_, int targets_, int yards_, double average_, int longest_, int touchdowns_, int f_downs, int fumbles_, int fumbles_l_){
        super( name_, yards_, touchdowns_);
        this.receptions = receptions_;
        this.targets = targets_;
        this.average = average_;
        this.fumbles = fumbles_;
        this.fumbles_lost = fumbles_l_;
        this.longest = longest_;
        this.firstDowns = f_downs;
    }
    
    public TightEnd(int number_,String name_, String position_, int height_, int weight_,int age_, int experience_, String college_){
        
        super(number_, name_, position_, height_, weight_, age_, experience_, college_);
    }
    
    // GET SET METHODS for the attributes defined within TightEnd
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
    
    public int getFumbles(){
        return fumbles;
    }
    
    public int setFumbles(int f){
        return this.fumbles = f;
        
    }
    
    public int getFumblesLost(){
        return fumbles_lost;
    }
    public int setFumblesLost( int f_l){
        return this.fumbles_lost = f_l;
        
    }
    
    public int getFirstDowns(){
        return firstDowns;
    }
    public int setFirstDowns(int f_d){
        return this.firstDowns = f_d;
    }
    
    // PRINT INFO
    public void printInfo(){
        super.printPlayerInfo();
        
    }
    
    String te_format = "%20s %10s %10s %10s %10s %10s %10s %10s %10s %10s %n";
    public void printTEHeader(){
        System.out.format(player_title_position_format, "Tight End" );
        System.out.print("\n");
        System.out.format(te_format, "Name", "REC", "TGTS", "YDS", "AVG", "LNG", "TD", "FD", "FUM", "LST" );
    }
    // Overrides the super class print method for player stats
    @ Override
    public void printPlayerStats(){
        System.out.format(te_format, this.name, this.receptions, this.targets, this.yards, this.average, this.longest, this.touchdowns, this.firstDowns, this.fumbles, this.fumbles_lost);
    }
    
}
