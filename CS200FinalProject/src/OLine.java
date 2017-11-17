
public class OLine extends Offense {
     int penalties;
     int penalty_yards;
     int sacks_allowed;
     int sacks_allowed_yards;
     int false_start_penalties;
     int holding_penalties;
    
    public OLine(int number_,String name_, String position_,  int height_, int weight_,int age_, int experience_, String college_){
        
        super(number_, name_, position_, height_, weight_, age_, experience_, college_);
        
    }
    public OLine(String name,int pen_, int penYds_, int opp_sck, int opp_sck_yds, int fst, int hld_){
        super(name);
        this.penalties = pen_;
        this.penalty_yards = penYds_;
        this.sacks_allowed = opp_sck;
        this.sacks_allowed_yards = opp_sck_yds;
        this.false_start_penalties = fst;
        this.holding_penalties = hld_;
    }
    
    public int getPenalties(){
        return this.penalties;
    }
    public int setPenalties( int pen){
        return this.penalties = pen;
    }
    
    public int getpenYards(){
        return this.penalty_yards;
    }
    public int setPenYds( int p_y){
        return this.penalty_yards = p_y;
    }
    
    public int getSacksAll(){
        return this.sacks_allowed;
    }
    public int setSacksAll( int s_a){
        return this.sacks_allowed = s_a;
    }
    
    public int getSacksAllYards(){
        return this.sacks_allowed_yards;
    }
    public int setSacksAllYards( int s_a_y){
        return this.sacks_allowed_yards = s_a_y;
    }
    
    public int getFalseStart(){
        return this.false_start_penalties;
    }
    public int setFalseStart( int fs){
        return this.false_start_penalties = fs;
    }
    
    public int getholding(){
        return this.holding_penalties;
    }
    public int setHolding( int hold){
        return this.holding_penalties = hold;
    }
    
    public void printInfo(){
        super.printPlayerInfo();
        
    }

    String oline_format = "%23s %7s %10s %10s %10s %10s %10s %n";
    public void printOlineHeader(){
        System.out.print("\n");
        System.out.format(player_title_position_format,"Offensive Line");
        System.out.print("\n");
        System.out.format( oline_format,"Name", "PEN", "PEN YDS", "OPP SCK", "SCK YDS", "FST", "HLD");
    }
    // Overrides the super class print method for player stats
    @Override
    public void printPlayerStats(){
  
        System.out.format(oline_format, this.name, this.penalties, this.penalty_yards, this.sacks_allowed, this.sacks_allowed_yards, this.false_start_penalties, this.holding_penalties );
    }
}
